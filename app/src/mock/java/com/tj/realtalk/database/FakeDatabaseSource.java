package com.tj.realtalk.database;

/**
 * Created by tj on 7/9/17.
 */


import com.tj.realtalk.GenericTestData;
import com.tj.realtalk.data.database.DatabaseSource;
import com.tj.realtalk.data.database.Profile;

import io.reactivex.Completable;
import io.reactivex.Maybe;


public class FakeDatabaseSource implements DatabaseSource {
    boolean returnFailure = false;
    boolean returnEmpty = false;

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
        return Maybe.just(GenericTestData.getProfile());
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