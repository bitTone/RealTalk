package com.tj.realtalk;

import android.support.annotation.StringRes;

/**
 * Created by tj on 7/2/17.
 */

public interface BaseView<T> {

    void setPresenter(T presenter);

    void makeToast(@StringRes int stringId );

    void makeToast(String message );





}
