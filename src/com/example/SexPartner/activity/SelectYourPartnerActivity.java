package com.example.SexPartner.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.example.SexPartner.R;
import com.example.SexPartner.activity.adapter.SelectYourPartnerAdapter;
import com.example.SexPartner.backend.model.Friend;
import com.example.SexPartner.backend.model.ormlite.DatabaseHelper;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.sql.SQLException;
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
    private DatabaseHelper databaseHelper;

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_your_partner);
        circularImageView = (CircularImageView) findViewById(R.id.select_your_partner_ivAvatar);
        lvYourPartner = (ListView) findViewById(R.id.select_your_partner_lvYourPartner);
        circularImageView.setBorderColor(getResources().getColor(R.color.gray));
        circularImageView.setBorderWidth(4);
        circularImageView.addShadow();
        databaseHelper = new DatabaseHelper(this);
        List<Friend> friends = new ArrayList<Friend>();
        try
        {
            friends = databaseHelper.getFriendDAO().queryForAll();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        adapter = new SelectYourPartnerAdapter(this, friends);
        lvYourPartner.setAdapter(adapter);
        lvYourPartner.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Intent intent = new Intent(SelectYourPartnerActivity.this, ChattingActivity.class);
                startActivity(intent);
            }
        });
    }

}