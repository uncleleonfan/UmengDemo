package com.example.leon.umengdemo;

import android.app.Application;

import com.umeng.analytics.MobclickAgent;

/**
 * Created by Leon on 2017/3/24.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        MobclickAgent.setScenarioType(this, MobclickAgent.EScenarioType.E_UM_NORMAL);
    }
}
