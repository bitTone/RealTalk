package com.tj.realtalk.scheduler;

import com.tj.realtalk.util.BaseSchedulerProvider;
import com.tj.realtalk.util.ImmediateSchedulerProvider;

/**
 * Created by tj on 7/9/17.
 */



public class SchedulerInjection {

    public static BaseSchedulerProvider provideSchedulerProvider(){
        return ImmediateSchedulerProvider.getInstance();
    }

}