package com.brijesh.sampleandroidproject.utilities;

import android.util.Log;

/**
 * Logging utility class
 */

public class LogHelper {
    private static final String TAG = "SampleAndroidProject";

    public static void logError(String message, Throwable throwable) {
        Log.e(TAG, message, throwable);
    }

}
