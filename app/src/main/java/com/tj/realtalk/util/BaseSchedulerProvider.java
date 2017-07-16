package com.tj.realtalk.util;

import io.reactivex.Scheduler;

/**
 * Created by tj on 7/12/17.
 */

public interface BaseSchedulerProvider {

    Scheduler computation();

    Scheduler io();

    Scheduler ui();
}