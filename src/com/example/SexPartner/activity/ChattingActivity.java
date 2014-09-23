package com.example.SexPartner.activity;

import android.app.Activity;
import android.os.Bundle;
import com.example.SexPartner.R;
import com.mikhaellopez.circularimageview.CircularImageView;

/**
 * Created by Jodie Pham on 9/12/14.
 */
public class ChattingActivity extends Activity
{
    private CircularImageView ivAvatar;
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chatting);
        ivAvatar = (CircularImageView)findViewById(R.id.chatting_ivAvatar);
        ivAvatar.setBorderColor(getResources().getColor(R.color.gray));
        ivAvatar.setBorderWidth(4);
        ivAvatar.addShadow();
    }
}