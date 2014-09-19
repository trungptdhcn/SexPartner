package com.example.SexPartner.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.SexPartner.R;

/**
 * User: Khiemvx
 * Date: 9/19/2014
 */
public class SplashFragment extends Fragment
{

    private SkipLoginCallback skipLoginCallback;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.login_to_facebook, container, false);
        return view;
    }

    public void setSkipLoginCallback(SkipLoginCallback callback)
    {
        skipLoginCallback = callback;
    }

    public interface SkipLoginCallback
    {
        void onSkipLoginPressed();
    }
}

