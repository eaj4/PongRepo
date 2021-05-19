package com.onlineschool.pong;

import android.content.Context;
import android.view.SurfaceView;

public class PongGame extends SurfaceView {

    // The PongGame constructor
    // Called when this line:
    // mPongGame = new PongGame(this, size.x, size.y);
    // is executed from PongActivity
    public PongGame(Context context, int x, int y) {

        // Super... calls the parent class

        // constructor of SurfaceView

        // provided by Android

        super(context);

    }
}
