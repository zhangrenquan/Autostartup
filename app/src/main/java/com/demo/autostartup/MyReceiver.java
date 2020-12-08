package com.demo.autostartup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(@NonNull Context context, Intent intent) {
        Intent autoStart = new Intent(context, LoginActivity.class);//启动跳转到登录页面
        autoStart.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);//必加  否则系统无法接受发送广播通知App启动
        context.startActivity(autoStart);
    }

}