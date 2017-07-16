package com.tj.realtalk.Login;

import com.tj.realtalk.data.Auth.AuthSource;
import com.tj.realtalk.util.BaseSchedulerProvider;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by tj on 6/27/17.
 */

public class LoginPresenter implements LoginContract.Presenter {
    private AuthSource authSource;
    private LoginContract.View view;
    private CompositeDisposable compositeDisposable;
    private BaseSchedulerProvider schedulerProvider;


    public LoginPresenter (AuthSource authSource,
                           LoginContract.View view,
                           BaseSchedulerProvider schedulerProvider){
        this.authSource = authSource;
        this.view = view;
        this.schedulerProvider = schedulerProvider;
        this.compositeDisposable = new CompositeDisposable();

    }

    @Override
    public void onLogInClick() {

    }

    @Override
    public void onCreateClick() {

    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unsubscribe() {

    }
}