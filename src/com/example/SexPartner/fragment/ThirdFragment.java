package com.example.SexPartner.fragment;

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

public class ThirdFragment extends Fragment
{

    public static ThirdFragment newInstance()
    {
        ThirdFragment f = new ThirdFragment();
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.user_guide_third_screen, container, false);

        return v;
    }
}