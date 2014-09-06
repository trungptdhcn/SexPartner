package com.example.SexPartner.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import com.example.SexPartner.R;

/**
 * Created by Jodie Pham on 9/3/14.
 */
public class CreatePINActivity extends Activity implements View.OnClickListener
{
    private EditText edtPIN1;
    private EditText edtPIN2;
    private EditText edtPIN3;
    private EditText edtPIN4;
    private Button btContinue;

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_pin);
        edtPIN1 = (EditText) findViewById(R.id.create_pin_edtPIN1);
        edtPIN2 = (EditText) findViewById(R.id.create_pin_edtPIN2);
        edtPIN3 = (EditText) findViewById(R.id.create_pin_edtPIN3);
        edtPIN4 = (EditText) findViewById(R.id.create_pin_edtPIN4);
        btContinue = (Button) findViewById(R.id.create_pin_btContinue);
        setFocusEditTextPin();
        btContinue.setOnClickListener(this);

    }

    public void setFocusEditTextPin()
    {

        edtPIN1.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (edtPIN1.getText().toString().length() == 1)     //size as per your requirement
                {
                    edtPIN2.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });

        edtPIN2.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (edtPIN2.getText().toString().length() == 1)     //size as per your requirement
                {
                    edtPIN3.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });

        edtPIN3.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (edtPIN3.getText().toString().length() == 1)     //size as per your requirement
                {
                    edtPIN4.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });

        edtPIN4.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (edtPIN4.getText().toString().length() == 1)     //size as per your requirement
                {
                    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.create_pin_btContinue:
                Intent intent = new Intent(this, FirstPartnerActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
                break;
        }
    }
}