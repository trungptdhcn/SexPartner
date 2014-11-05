package com.example.SexPartner.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import com.example.SexPartner.R;
import com.example.SexPartner.adapter.BundleChatAdapter;
import com.mikhaellopez.circularimageview.CircularImageView;

/**
 * Created by Jodie Pham on 9/12/14.
 */
public class ChattingActivity extends Activity
{
    private CircularImageView ivAvatar;
    ListView lvChatBundle;
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chatting);
        ivAvatar = (CircularImageView)findViewById(R.id.chatting_ivAvatar);
        lvChatBundle = (ListView)findViewById(R.id.chatting_lvLogchat);
        BundleChatAdapter bundleChatAdapter = new BundleChatAdapter(this);
        lvChatBundle.setAdapter(bundleChatAdapter);
        ivAvatar.setBorderColor(getResources().getColor(R.color.gray));
        ivAvatar.setBorderWidth(4);
        ivAvatar.addShadow();
    }
}