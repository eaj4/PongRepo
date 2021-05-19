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
}
