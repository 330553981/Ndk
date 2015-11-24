package com.violet;

import android.app.Application;

/**
 * Created by apple on 15/11/23.
 */
public class VioletApplication extends Application{

    static{
       System.loadLibrary("JniSquare");
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
