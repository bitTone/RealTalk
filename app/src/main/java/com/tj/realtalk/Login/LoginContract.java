package com.tj.realtalk.Login;

import android.support.annotation.StringRes;

import com.tj.realtalk.BasePresenter;
import com.tj.realtalk.BaseView;

/**
 * Created by tj on 6/27/17.
 */

public interface LoginContract {
    interface View extends BaseView<Presenter> {
        void makeToast(@StringRes int stringId);

        void makeToast(String message);

        String getEmail();

        String getPassword();

        void startProfileActivity();

        void startCreateAccountActivity();

        void setPresenter(LoginContract.Presenter presenter);

        void showProgressIndicator(boolean show);
    }

    interface Presenter extends BasePresenter {
        void onLogInClick();

        void onCreateClick();

    }
}