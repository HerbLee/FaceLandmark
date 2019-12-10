/**
 * Company
 * Copyright (C) 2019 All Rights Reserved.
 */
package com.herb2sy.facelandmark;

/**
 * @author herb
 * @date Created on 2019/12/10 1:18
 * @function: some point
 */
public class FacePoint {

    private int oriIndex;
    private float x;
    private float y;


    public FacePoint(int oriIndex, float x, float y) {
        this.oriIndex = oriIndex;
        this.x = x;
        this.y = y;
    }

    public int getOriIndex() {
        return oriIndex;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public FacePoint(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public FacePoint() {
    }

    @Override
    public String toString() {
        return "FacePoint{" +
                "oriIndex=" + oriIndex +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
