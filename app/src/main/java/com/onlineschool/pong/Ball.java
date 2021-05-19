package com.onlineschool.pong;
import android.graphics.RectF;

public class Ball {

    // These are the member variables (fields)
    // They all have the m prefix
    // They are all private
    // because direct access is not required
    private RectF mRect;
    private float mXVelocity;
    private float mYVelocity;
    private float mBallWidth;
    private float mBallHeight;

    // This is the constructor method.
    // It is called by the code:
    // mBall = new Ball(mScreenX);
    // In the PongGame class
    public Ball(int screenX){

        // Make the ball square and 1% of screen width
        // of the screen width
        mBallWidth = screenX / 100;
        mBallHeight = screenX / 100;

        // Initialize the RectF with 0, 0, 0, 0
        // We do it here because we only want to
        // do it once.
        // We will initialize the detail
        // at the start of each game
        mRect = new RectF();
    }

    // Return a reference to mRect to PongGame
    RectF getRect(){
        return mRect;
    }

}