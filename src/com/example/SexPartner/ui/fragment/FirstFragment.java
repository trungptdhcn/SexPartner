package com.example.SexPartner.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.SexPartner.R;

/**
 * User: Khiemvx
 * Date: 9/6/2014
 */

public class FirstFragment extends Fragment
{

    public static FirstFragment newInstance()
    {
        FirstFragment f = new FirstFragment();
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.user_guide_first_screen, container, false);

        return v;
    }
}