package com.tj.realtalk.data.database;

/**
 * Created by tj on 7/9/17.
 */


import io.reactivex.Completable;
import io.reactivex.Maybe;


public class FakeDatabaseSource implements DatabaseSource {
    boolean returnFailure = false;
    boolean returnEmpty = false;

    private static final Profile fakeProfile =
            new Profile(
                    "",
                    "",
                    "someId",
                    "email@example.com",
                    "someUrl",
                    "Derp"
            );

    @Override
    public void setReturnEmpty(boolean returnEmpty) {
        this.returnEmpty = returnEmpty;
    }

    public FakeDatabaseSource(){

    }

    public static FakeDatabaseSource getInstance (){
        return new FakeDatabaseSource();
    }

    @Override
    public void setReturnFail(boolean returnFailure){
        this.returnFailure = returnFailure;
    }

    @Override
    public Completable createProfile(Profile profile) {
        if (returnFailure){
            return Completable.error(new Exception());
        }
        return Completable.complete();
    }

    @Override
    public Maybe<Profile> getProfile(String uid) {
        if (returnFailure){
            return Maybe.error(new Exception());
        } else if (returnEmpty) {
            return Maybe.empty();
        }
        return Maybe.just(fakeProfile);
    }

    @Override
    public Completable deleteProfile(String uid) {
        if (returnFailure){
            return Completable.error(new Exception());
        }
        return Completable.complete();
    }

    @Override
    public Completable updateProfile(Profile profile) {
        if (returnFailure){
            return Completable.error(new Exception());
        }
        return Completable.complete();
    }
}