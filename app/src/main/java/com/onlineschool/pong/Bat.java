package com.onlineschool.pong;

import android.graphics.RectF;

public class Bat {

    // These are the member variables (fields)
    // They all have the m prefix
    // They are all private
    // because direct access is not required
    private RectF mRect;
    private float mLength;
    private float mXCoord;
    private float mBatSpeed;
    private int mScreenX;
    // These variables are public and final
    // They can be directly accessed by
    // the instance (in PongGame)
    // because they are part of the same
    // package but cannot be changed
    final int STOPPED = 0;
    final int LEFT = 1;
    final int RIGHT = 2;
    // Keeps track of if and how the bat is moving
    // Starting with STOPPED condition
    private int mBatMoving = STOPPED;

    public Bat(int sx, int sy){

        // Bat needs to know the screen
        // horizontal resolution
        // Outside of this method
        mScreenX = sx;

        // Configure the size of the bat based on
        // the screen resolution
        // One eighth the screen width
        mLength = mScreenX / 8;

        // One fortieth the screen height
        float height = sy / 40;

        // Configure the starting location of the bat
        // Roughly the middle horizontally
        mXCoord = mScreenX / 2;

        // The height of the bat
        // off the bottom of the screen
        float mYCoord = sy - height;

        // Initialize mRect based on the size and position
        mRect = new RectF(mXCoord, mYCoord,mXCoord + mLength,mYCoord + height);

        // Configure the speed of the bat
        // This code means the bat can cover the
        // width of the screen in 1 second
        mBatSpeed = mScreenX;
    }
}
