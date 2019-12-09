/**
 * Company
 * Copyright (C) 2019 All Rights Reserved.
 */
package com.herb2sy.facelandmark;

import java.util.Random;

/**
 * @author herb
 * @date Created on 2019/12/10 1:13
 * @function:
 */
public class MockData {

    public static void main(String[] args) {

        int [] arr = new  int [106*2];
        for (int i = 0; i < 106*2; i++) {

            Random random = new Random();
            arr[i] = random.nextInt(100);
        }
//        System.out.println(Arrays.toString(arr));

        FaceLandmark faceLandmark = new FaceLandmark(arr);
        int point = faceLandmark.getIndex(Landmark.FACE_OVAL,1);
        System.out.println(point);


    }


}
