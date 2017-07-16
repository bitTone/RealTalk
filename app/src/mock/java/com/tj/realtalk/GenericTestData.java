package com.tj.realtalk;

import com.tj.realtalk.data.Auth.Credentials;
import com.tj.realtalk.data.Auth.User;
import com.tj.realtalk.data.database.Profile;

/**
 * Created by tj on 7/12/17.
 */

public class GenericTestData {
    public static String getValidEmail(){
        return "derp@example.com";
    }

    public static String getInvalidEmail(){
        return "derpatexample.com";
    }

    public static String getName(){
        return "Derp";
    }

    public static String getValidPassword(){
        return "123456";
    }

    public static String getInvalidPassword(){
        return "12345";
    }

    public static User getUser(){
        return new User("derp@example.com", "someUid");
    }

    public static Credentials getCredentials(){
        return new Credentials("123456", "Derp", "derp@example.com");
    }

    public static Profile getProfile() {
        return new Profile(
                "",
                "",
                "someUid",
                "derp@example.com",
                "",
                "Derp"
        );
    }

    public static String getPhotoUri (){
        return "derp/example.jpeg";
    }
}
