package com.backpacker.UtilsLibrary.java;

import android.content.Context;

import java.util.concurrent.*;

public class ThreeUtil {
    private Context mContext;
    private static volatile ThreeUtil _instance = null;

    private ThreeUtil(Context context) {
        this.mContext = context;
    }

    public static ThreeUtil getInstance(Context context) {
        if (_instance == null) {
            synchronized (ThreeUtil.class) {
                if (_instance == null) {
                    _instance = new ThreeUtil(context);
                }
            }
        }
        return _instance;
    }

    public static void startThree() {

    }


}
