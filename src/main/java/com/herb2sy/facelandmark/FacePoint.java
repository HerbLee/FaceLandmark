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
    private int x;
    private int y;


    public FacePoint(int oriIndex, int x, int y) {
        this.oriIndex = oriIndex;
        this.x = x;
        this.y = y;
    }

    public int getOriIndex() {
        return oriIndex;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public FacePoint(int x, int y) {
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
