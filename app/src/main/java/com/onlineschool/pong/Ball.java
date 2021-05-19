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

    // Update the ball position.
    // Called each frame/loop
    void update(long fps){

        // Move the ball based upon the
        // horizontal (mXVelocity) and
        // vertical(mYVelocity) speed
        // and the current frame rate(fps)
        // Move the top left corner
        mRect.left = mRect.left + (mXVelocity / fps);
        mRect.top = mRect.top + (mYVelocity / fps);

        // Match up the bottom right corner
        // based on the size of the ball
        mRect.right = mRect.left + mBallWidth;
        mRect.bottom = mRect.top + mBallHeight;

    }

    // Reverse the vertical direction of travel
    void reverseYVelocity(){
        mYVelocity = -mYVelocity;
    }

    // Reverse the horizontal direction of travel
    void reverseXVelocity(){
        mXVelocity = -mXVelocity;
    }

    //resets position of the ball
    void reset(int x, int y){
        // Initialise the four points of
        // the rectangle which defines the ball
        mRect.left = x / 2;
        mRect.top = 0;
        mRect.right = x / 2 + mBallWidth;
        mRect.bottom = mBallHeight;

        // How fast will the ball travel
        // You could vary this to suit
        // You could even increase it as the game progresses
        // to make it harder
        mYVelocity = -(y / 3);
        mXVelocity = (x / 2);

    }

}