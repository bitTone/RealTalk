package com.tj.realtalk.util;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by tj on 7/12/17.
 */

public class SchedulerProvider implements BaseSchedulerProvider {
    private static SchedulerProvider INSTANCE;

    private SchedulerProvider(){
        //prevents direct instantiation
    }

    public static synchronized SchedulerProvider getInstance (){
        if (INSTANCE == null) {
            INSTANCE = new SchedulerProvider();
        }
        return INSTANCE;
    }

    @Override
    public Scheduler computation() {
        return Schedulers.computation();
    }

    @Override
    public Scheduler io() {
        return Schedulers.io();
    }

    @Override
    public Scheduler ui() {
        return AndroidSchedulers.mainThread();
    }
}
