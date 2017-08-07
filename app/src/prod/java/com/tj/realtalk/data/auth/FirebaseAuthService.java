package com.tj.realtalk.data.Auth;


import com.tj.realtalk.data.Auth.AuthSource;
import com.tj.realtalk.data.Auth.Credentials;
import com.tj.realtalk.data.Auth.User;

import io.reactivex.Completable;
import io.reactivex.Maybe;

public class FirebaseAuthService implements AuthSource {

    public FirebaseAuthService () {

    }

    public static AuthSource getInstance() {
        return new FirebaseAuthService();
    }

    @Override
    public Completable createAccount(Credentials cred) {
        return null;
    }

    @Override
    public Completable attemptLogin(Credentials cred) {
        return null;
    }

    @Override
    public Completable deleteUser() {
        return null;
    }

    @Override
    public Maybe<User> getUser() {
        return null;
    }

    @Override
    public Completable logUserOut() {
        return null;
    }

    @Override
    public Completable reauthenticateUser(String password) {
        return null;
    }

    @Override
    public void setReturnFail(boolean bool) {

    }
}