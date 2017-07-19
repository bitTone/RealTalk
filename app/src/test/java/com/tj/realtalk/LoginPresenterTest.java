package com.tj.realtalk;

import com.tj.realtalk.Login.LoginContract;
import com.tj.realtalk.Login.LoginPresenter;
import com.tj.realtalk.data.Auth.AuthSource;
import com.tj.realtalk.data.scheduler.SchedulerInjection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

/**
 * Created by tj on 7/19/17.
 */

@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {

    @Mock
    private LoginContract.View view;

    private LoginPresenter presenter;

    @Mock
    private AuthSource authSource;

    public static final String VALID_PASSWORD = "123456";

    public static final String INVALID_PASSWORD = "12345";

    public static final String LONG_PASSWORD = "12345678912345678912";

    public static final String USERNAME = "Derp";

    public static final String INVALID_EMAIL = "userexample.com";

    public static final String VALID_EMAIL = "user@example.com";


    @Before
    public void SetUp() throws Exception {
        MockitoAnnotations.initMocks(this);


        //authSource = AuthInjection.provideAuthSource();
        presenter = new LoginPresenter(
                authSource,
                view,
                SchedulerInjection.provideSchedulerProvider()
        );

    }


    @Test
    public void whenUserLoginAttemptSucceeds() throws Exception {

        presenter.onLogInClick();

        verify(view).makeToast(Mockito.anyString());
    }
}