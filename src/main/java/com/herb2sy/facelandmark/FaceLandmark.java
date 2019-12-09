/**
 * Company
 * Copyright (C) 2019 All Rights Reserved.
 */
package com.herb2sy.facelandmark;

import java.util.ArrayList;
import java.util.List;

/**
 * @author herb
 * @date Created on 2019/12/10 0:27
 * @function: Face key point formatting based on HyperLandmark
 */
public class FaceLandmark {


    // All face key point
    private int[] landmarks;


    public FaceLandmark() {
    }

    public FaceLandmark(int[] landmarks) {
        this.landmarks = landmarks;
    }

    // return new index
    public int getIndex(int type,int oriIndex){
        if (type < Landmark.FACE_OVAL || type > Landmark.LOWER_LIP_BOTTOM) {
            throw new NullPointerException("type out of bounds exception");
        }
        int res;
        switch (type) {
            case Landmark.FACE_OVAL:
                res = getNewIndex(LandmarkPointMap.getFaceOval(),oriIndex);
                break;
            case Landmark.LEFT_EYEBROW_TOP:
                res = getNewIndex(LandmarkPointMap.getLeftEyeBrowTop(),oriIndex);
                break;
            case Landmark.LEFT_EYEBROW_BOTTOM:
                res =  getNewIndex(LandmarkPointMap.getLeftEyeBrowBottom(),oriIndex);
                break;
            case Landmark.RIGHT_EYEBROW_BOTTOM:
                res =  getNewIndex(LandmarkPointMap.getRightEyeBrowBottom(),oriIndex);
                break;
            case Landmark.RIGHT_EYEBROW_TOP:
                res =  getNewIndex(LandmarkPointMap.getRightEyeBrowTop(),oriIndex);
                break;
            case Landmark.LEFT_EYE:
                res =  getNewIndex(LandmarkPointMap.getLeftEye(),oriIndex);
                break;
            case Landmark.RIGHT_EYE:
                res =  getNewIndex(LandmarkPointMap.getRightEye(),oriIndex);
                break;
            case Landmark.NOSE_BRIDGE:
                res =  getNewIndex(LandmarkPointMap.getNoseBridge(),oriIndex);
                break;
            case Landmark.NOSE_BOTTOM:
                res =  getNewIndex(LandmarkPointMap.getNoseBottom(),oriIndex);
                break;
            case Landmark.UPPER_LIP_TOP:
                res =  getNewIndex(LandmarkPointMap.getUpperLipTop(),oriIndex);
                break;
            case Landmark.LOWER_LIP_BOTTOM:
                res =  getNewIndex(LandmarkPointMap.getLowerLipBottom(),oriIndex);
                break;
            case Landmark.LOWER_LIP_TOP:
                res =  getNewIndex(LandmarkPointMap.getLowerLipTop(),oriIndex);
                break;
            case Landmark.UPPER_LIP_BOTTOM:
                res =  getNewIndex(LandmarkPointMap.getUpperLipBottom(),oriIndex);
                break;
            default:
                res = -1;
                break;

        }

        return res;

    }
    private int getNewIndex(int arr [] ,int index){
        if (arr == null || arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == index){
                return i;
            }
        }
        return -1;
    }


    public List<FacePoint> getPoint(int type) {

        if (landmarks == null || landmarks.length != 106*2){
            throw new NullPointerException("please input data length 212");
        }

        if (type < Landmark.FACE_OVAL || type > Landmark.LOWER_LIP_BOTTOM) {
            throw new NullPointerException("type out of bounds exception");
        }
        List<FacePoint> res;
        switch (type) {
            case Landmark.FACE_OVAL:
                res = getFaceList(LandmarkPointMap.getFaceOval());
                break;
            case Landmark.LEFT_EYEBROW_TOP:
                res = getFaceList(LandmarkPointMap.getLeftEyeBrowTop());
                break;
            case Landmark.LEFT_EYEBROW_BOTTOM:
                res =  getFaceList(LandmarkPointMap.getLeftEyeBrowBottom());
                break;
            case Landmark.RIGHT_EYEBROW_BOTTOM:
                res =  getFaceList(LandmarkPointMap.getRightEyeBrowBottom());
                break;
            case Landmark.RIGHT_EYEBROW_TOP:
                res =  getFaceList(LandmarkPointMap.getRightEyeBrowTop());
                break;
            case Landmark.LEFT_EYE:
                res =  getFaceList(LandmarkPointMap.getLeftEye());
                break;
            case Landmark.RIGHT_EYE:
                res =  getFaceList(LandmarkPointMap.getRightEye());
                break;
            case Landmark.NOSE_BRIDGE:
                res =  getFaceList(LandmarkPointMap.getNoseBridge());
                break;
            case Landmark.NOSE_BOTTOM:
                res =  getFaceList(LandmarkPointMap.getNoseBottom());
                break;
            case Landmark.UPPER_LIP_TOP:
                res =  getFaceList(LandmarkPointMap.getUpperLipTop());
                break;
            case Landmark.LOWER_LIP_BOTTOM:
                res =  getFaceList(LandmarkPointMap.getLowerLipBottom());
                break;
            case Landmark.LOWER_LIP_TOP:
                res =  getFaceList(LandmarkPointMap.getLowerLipTop());
                break;
            case Landmark.UPPER_LIP_BOTTOM:
                res =  getFaceList(LandmarkPointMap.getUpperLipBottom());
                break;
            default:
                res = null;
                break;

        }

        return res;
    }


    private List<FacePoint> getFaceList(int [] points){
        if (landmarks == null || landmarks.length != 212){
            return null;
        }
        ArrayList<FacePoint> facePoints = new ArrayList<>();
        for (int i = 0; i < points.length; i++) {
            int index = points[i];
            facePoints.add(new FacePoint(index,landmarks[(index-1)*2],landmarks[(index-1)*2+1]));
        }
        return facePoints;
    }


}
