package com.backpacker.UtilsLibrary.kotlin

import android.os.Handler
import android.os.Looper
import android.os.Message
import java.util.concurrent.Executors

/**
 * @Title:  MyApplication
 * @Package com.example.myapplication
 * @Description:    $todo$
 * @author: L-BackPacker
 * @date:   2019/5/13 21:47
 * @version V 1.0 xxxxxxxx
 * @verdescript  版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2019
 */
abstract class DbCommand<T> {
    private val sDbMangerEngine = Executors.newCachedThreadPool()
    private val mUiHandler = Handler(Looper.getMainLooper())
    fun execture() {
        sDbMangerEngine.execute {
            try {
                doBackground()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    fun postResult(t: T) {
        mUiHandler.post {
            onPostExecture(t)
        }
    }

    abstract fun doBackground(): T;
    abstract fun onPostExecture(result: T);
}