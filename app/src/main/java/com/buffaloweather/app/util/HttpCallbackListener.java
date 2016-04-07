package com.buffaloweather.app.util;

/**
 * Created by 大水牛 on 2016/4/7.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
