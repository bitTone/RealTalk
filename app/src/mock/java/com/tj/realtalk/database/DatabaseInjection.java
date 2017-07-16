package com.tj.realtalk.database;


import com.tj.realtalk.data.database.DatabaseSource;

/**
 * Created by tj on 7/9/17.
 */

public class DatabaseInjection {
    public static DatabaseSource provideDatabaseSource() {
        return FakeDatabaseSource.getInstance();
    }
}