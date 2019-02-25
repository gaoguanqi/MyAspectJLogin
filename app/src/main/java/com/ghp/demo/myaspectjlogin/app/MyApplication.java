package com.ghp.demo.myaspectjlogin.app;

import android.app.Application;

/**
 * author: gaogq
 * time: 2019/2/25 13:29
 * description:
 */
public class MyApplication extends Application {
    private static MyApplication app;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }


    public static MyApplication getInstance() {
        return app;
    }
}
