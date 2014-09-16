package com.example.SexPartner.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.example.SexPartner.R;
import com.example.SexPartner.activity.CreatePINActivity;

/**
 * User: Khiemvx
 * Date: 9/6/2014
 */

public class FiveFragment extends Fragment implements View.OnClickListener
{
    Button btStart;

    public static FiveFragment newInstance()
    {
        FiveFragment f = new FiveFragment();
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.user_guide_five_screen, container, false);
        btStart = (Button) v.findViewById(R.id.user_guide_five_screen_btStart);
        btStart.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.user_guide_five_screen_btStart:
                Intent intentCallScreenLogin = new Intent(getActivity(), CreatePINActivity.class);
                startActivity(intentCallScreenLogin);
                getActivity().finish();
        }
    }
}