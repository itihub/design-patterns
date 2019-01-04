package com.xxx.design.principles.liskovsubstitution;

/**
 * Created by geely
 */
    public class Square implements Quadrangle {
    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    public long getWidth() {
        return sideLength;
    }

    public long getLength() {
        return sideLength;
    }
}
