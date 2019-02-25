package com.ghp.demo.myaspectjlogin.utils;

import android.util.Log;


public class LogUtils {

   // private static boolean isShow = BuildConfig.DEBUG;
    private static boolean isShow = true;
    public static void logGGQ(String msg){
        if(isShow){
            Log.i("GGQ", msg);
        }
    }
}
