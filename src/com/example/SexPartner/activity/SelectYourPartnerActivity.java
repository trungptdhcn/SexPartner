package com.example.SexPartner.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import com.example.SexPartner.R;
import com.example.SexPartner.activity.adapter.SelectYourPartnerAdapter;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jodie Pham on 9/10/14.
 */
public class SelectYourPartnerActivity extends Activity
{
    private CircularImageView circularImageView;
    private SelectYourPartnerAdapter adapter;
    private ListView lvYourPartner;
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_your_partner);
        circularImageView = (CircularImageView)findViewById(R.id.select_your_partner_ivAvatar);
        lvYourPartner = (ListView) findViewById(R.id.select_your_partner_lvYourPartner);
        circularImageView.setBorderColor(getResources().getColor(R.color.gray));
        circularImageView.setBorderWidth(4);
        circularImageView.addShadow();
        List<String> names = new ArrayList<String>();
        names.add("Laura Timori");
        names.add("Natasha Ivan");
        names.add("Andrew Kimura");
        names.add("Kathy Hammod");
        names.add("Jackson Stewart");
        names.add("Sylvia Santosa");

        adapter = new SelectYourPartnerAdapter(this,names);
        lvYourPartner.setAdapter(adapter);
    }
}