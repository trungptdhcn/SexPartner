package com.example.SexPartner.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.SexPartner.R;

/**
 * Created by Jodie Pham on 9/3/14.
 */
public class FirstPartnerActivity extends Activity implements View.OnClickListener
{
    Button btFindYourPartner;

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_partner);
        btFindYourPartner = (Button) findViewById(R.id.first_partner_btLoginFaceBook);
        btFindYourPartner.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.first_partner_btLoginFaceBook:
                Intent intent = new Intent(this, LoginFaceBookActivity.class);
                startActivity(intent);
                break;
        }
    }
}