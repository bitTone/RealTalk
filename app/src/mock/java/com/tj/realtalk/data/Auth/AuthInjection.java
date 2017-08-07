package com.tj.realtalk.data.Auth;


/**
 * Created by tj on 7/9/17.
 */


    public class AuthInjection {

        public static AuthSource provideAuthSource(){

            return FakeAuthService.getInstance();
        }

    }


