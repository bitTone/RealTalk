package com.tj.realtalk.data.auth;

import com.tj.realtalk.data.Auth.AuthSource;

/**
 * Created by tj on 7/12/17.
 */

public class AuthInjection  {


    public static AuthSource provideAuthSource(){
        return FirebaseAuthService.getInstance();
    }


}
