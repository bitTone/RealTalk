package com.tj.realtalk.ProfilePage;

import com.tj.realtalk.BasePresenter;
import com.tj.realtalk.BaseView;

/**
 * Created by tj on 6/27/17.
 */


import com.tj.realtalk.BasePresenter;
import com.tj.realtalk.BaseView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by TJ on 7/12/2017.
 */

public interface ProfilePageContract {

    interface View extends BaseView<Presenter> {
        void setPresenter(ProfilePageContract.Presenter presenter);

        void setName (String name);

        void setEmail (String email);

        void setBio (String bio);

        void setInterests (String interests);

        void setProfilePhotoURL (String profilePhotoURL);

        void setDefaultProfilePhoto ();

        void startPhotoGalleryActivity();

        void startProfileDetailActivity();

        void startProfileSettingsActivity();

        void showLogoutSnackbar ();

        void startLoginActivity();

        void setThumbnailLoadingIndicator(boolean show);

        void setDetailLoadingIndicators(boolean show);



    }

    interface Presenter extends BasePresenter {
        void onThumbnailClick();

        void onEditProfileClick();

        void onLogoutClick();

        void onLogoutConfirmed();

        void onAccountSettingsClick();

        void onThumbnailLoaded();
    }
}