package com.tj.realtalk.createAccount;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tj.realtalk.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class create_account_fragment extends Fragment {


    public create_account_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_account_fragment, container, false);
    }

}
