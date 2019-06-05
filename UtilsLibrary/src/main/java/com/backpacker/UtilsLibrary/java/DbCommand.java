package com.backpacker.UtilsLibrary.java;

import android.os.Handler;
import android.os.Looper;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: kotlin_androidone
 * @Package com.backpacker.UtilsLibrary.java
 * @Description: 数局库异步线程
 * @author: L-BackPacker
 * @date: 2019/5/13 22:07
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2019
 */
public abstract class DbCommand<T> {
    private final ExecutorService sDbEngsin= Executors.newCachedThreadPool();
    private final Handler mUiHandle=new Handler(Looper.getMainLooper());
    public final  void execute(){
        sDbEngsin.execute(new Runnable() {
            @Override
            public void run() {
                try {
                  doInbackground();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
    private void postReuslt(final T t){
        mUiHandle.post(new Runnable() {
            @Override
            public void run() {
                onPostExecture(t);
            }
        });
    }

    protected  abstract  void onPostExecture(T reuslt);
    protected abstract  T doInbackground();
}
