package com.techpaliyal.loghelper

import android.util.Log


/*
CREATED BY : yogesh ON 02/10/20 5:37 PM
*/


object LogHelper {
    var isDebuggable = false
    fun systemOutPrint(log_str: String?) {
        if (isDebuggable) println(log_str)
    }

    fun systemErrPrint(log_str: String?) {
        if (isDebuggable) System.err.println(log_str)
    }

    fun printStackTrace(e: Exception) {
        if (isDebuggable) e.printStackTrace()
    }

    fun printStackTrace(t: Throwable) {
        if (isDebuggable) t.printStackTrace()
    }

    fun logD(tag: String?, log_str: String?) {
        if (isDebuggable) Log.d(tag, log_str!!)
    }

    fun logE(tag: String?, log_str: String?) {
        if (isDebuggable) Log.e(tag, log_str!!)
    }

    fun logI(tag: String?, log_str: String?) {
        if (isDebuggable) Log.i(tag, log_str!!)
    }

    fun logV(tag: String?, log_str: String?) {
        if (isDebuggable) Log.v(tag, log_str!!)
    }

    fun logW(tag: String?, log_str: String?) {
        if (isDebuggable) Log.w(tag, log_str!!)
    }
}