package com.tj.realtalk.data.auth;



import com.tj.realtalk.data.Auth.AuthSource;
import com.tj.realtalk.data.Auth.Credentials;
import com.tj.realtalk.data.Auth.User;

import io.reactivex.Completable;
import io.reactivex.Maybe;

/**
 * Created by tj on 7/9/17.
 */

public class FakeAuthService implements AuthSource {

    private static final User fakeUser =
            new User(
                    "email@example.com",
                    "someId"
            );

    boolean returnFailure = false;

    public FakeAuthService () {

    }

    public static AuthSource getInstance() {
        return new FakeAuthService();
    }


    @Override
    public Completable createAccount(Credentials cred) {
        if (returnFailure){
            Completable.error(new Exception());
        }
        return Completable.complete();
    }

    @Override
    public Completable attemptLogin(Credentials cred) {
        if (returnFailure){
            Completable.error(new Exception());
        }
        return Completable.complete();
    }

    @Override
    public Completable deleteUser() {
        if (returnFailure){
            Completable.error(new Exception());
        }
        return Completable.complete();
    }

    @Override
    public Maybe<User> getUser() {
        if (returnFailure){
            Maybe.error(new Exception());
        }
        return Maybe.just(fakeUser);
    }

    @Override
    public Completable logUserOut() {
        if (returnFailure){
            Completable.error(new Exception());
        }
        return Completable.complete();
    }

    @Override
    public Completable reauthenticateUser(String password) {
        if (returnFailure){
            Completable.error(new Exception());
        }
        return Completable.complete();
    }

    @Override
    public void setReturnFail(boolean bool) {
        returnFailure = bool;
    }
}