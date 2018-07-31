package app.somnus.com.androidfactorydemo

import android.util.Log

/**
 * Created by Somnus on 2018/7/10.
 */

val MTAG = "KTLOG"
val isShowLog = true

fun ktLog(mMessage: String) = ktLogd(mMessage)

fun ktLogd(message: String) {
    if (isShowLog) {
        Log.d(MTAG, message)
    }
}

fun ktLoge(message: String) {
    if (isShowLog)
        Log.e(MTAG, message)
}