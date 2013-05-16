package com.sina.alarm;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;


/**
 * Filename:    ActivityStackControlUtil.java
 * Package:     info.wegosoft.android.util
 * Description: activity栈管理类，每当新产生一个activity时就加入，finish掉一个activity时就remove，这样到最后需要
 * 完全退出程序时就只要调用finishProgram方法就可以将程序完全结束。
 * Copyright:   Copyright (c) wegosoft.info 2011
 *
 * @author:
 * @email:
 * @version: 1.0
 * Create at:   2011-8-8 下午05:15:51
 */
public class ActivityStackControlUtil {

    private static List<Activity> activityList = new ArrayList<Activity>();

    public static void remove(Activity activity) {

        activityList.remove(activity);

    }

    public static void add(Activity activity) {

        activityList.add(activity);

    }

    public static void finishProgram() {

        for (Activity activity : activityList) {

            activity.finish();

        }

        android.os.Process.killProcess(android.os.Process.myPid());

    }
}  