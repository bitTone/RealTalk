package com.tj.realtalk.data.scheduler;

import com.tj.realtalk.util.BaseSchedulerProvider;
import com.tj.realtalk.util.SchedulerProvider;

/**
 * Created by tj on 7/12/17.
 */

public class SchedulerInjection {
    public static BaseSchedulerProvider provideSchedulerProvider(){
        return SchedulerProvider.getInstance();
    }
}