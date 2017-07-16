package com.tj.realtalk.data.Auth;

/**
 * Created by tj on 7/8/17.
 */
import android.support.annotation.VisibleForTesting;

import io.reactivex.Completable;
import io.reactivex.Maybe;



public interface AuthSource {

    Completable createAccount(Credentials cred);

    Completable attemptLogin(Credentials cred);

    Completable deleteUser();

    Maybe<User> getUser();

    Completable logUserOut();

    Completable reauthenticateUser(String password);

    void setReturnFail(boolean bool);
}