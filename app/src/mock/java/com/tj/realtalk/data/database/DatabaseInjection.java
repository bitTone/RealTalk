package com.tj.realtalk.data.database;


/**
 * Created by tj on 7/9/17.
 */

public class DatabaseInjection {
    public static DatabaseSource provideDatabaseSource() {
        return FakeDatabaseSource.getInstance();
    }
}