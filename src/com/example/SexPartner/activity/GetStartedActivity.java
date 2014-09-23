package com.example.SexPartner.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.example.SexPartner.R;
import com.facebook.*;
import com.facebook.widget.LoginButton;

import java.util.Arrays;

/**
 * Created by Jodie Pham on 9/3/14.
 */
public class GetStartedActivity extends Activity implements View.OnClickListener
{
    private static final String TAG = "MyActivity";
    private UiLifecycleHelper uiHelper;
    private Button btGetList;
    Session.NewPermissionsRequest newPermissionsRequest;

    private Session.StatusCallback statusCallback = new Session.StatusCallback()
    {
        @Override
        public void call(Session session, SessionState state, Exception exception)
        {
            onSessionStateChange(session, state, exception);
            Log.d("trung", session.toString());
        }
    };

    @Override
    public void onCreate(final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        uiHelper = new UiLifecycleHelper(this, statusCallback);
        uiHelper.onCreate(savedInstanceState);
        setContentView(R.layout.get_started);
        LoginButton authButton = (LoginButton) findViewById(R.id.get_started_btFindYourPartner);
        authButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                onClickLogin();
            }
        });
    }


    private void onClickLogin()
    {
//        Session session = Session.getActiveSession();
//        if (!session.isOpened() && !session.isClosed())
//        {
//            session.openForRead(new Session.OpenRequest(this)
//                    .setPermissions(Arrays.asList("public_profile", "user_friends"))
//                    .setCallback(statusCallback));
//        }
//        else
//        {
//            Session.openActiveSession(this, true, statusCallback);
//        }
        Session session = Session.getActiveSession();
        if (session == null)
        {
            session = new Session(this);
        }
        Session.setActiveSession(session);

        Session.OpenRequest request = new Session.OpenRequest(this).setCallback(statusCallback);
        request.setPermissions(Arrays.asList("public_profile", "user_friends"));
        if (session.getState().equals(SessionState.CREATED_TOKEN_LOADED))
        {
            session.openForPublish(request);
        }
        else
        {
            session = Session.openActiveSession(GetStartedActivity.this, true, statusCallback);
        }
    }

    private void onSessionStateChange(Session session, SessionState state, Exception exception)
    {
        if (state.isOpened())
        {
            Log.i(TAG, "Logged in...");
        }
        else if (state.isClosed())
        {
            Log.i(TAG, "Logged out...");
        }
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Session session = Session.getActiveSession();
        if (session != null &&
                (session.isOpened() || session.isClosed()))
        {
            onSessionStateChange(session, session.getState(), null);
        }

        uiHelper.onResume();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        uiHelper.onPause();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        uiHelper.onDestroy();
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        uiHelper.onStop();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        uiHelper.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        uiHelper.onSaveInstanceState(outState);
    }

    public void getListFriend()
    {
        new AsyncTask<Void, Void, Void>()
        {

            @Override
            protected Void doInBackground(Void... params)
            {
                new Request(
                        Session.getActiveSession(),
                        "me/taggable_friends",
                        null,
                        HttpMethod.GET,
                        new Request.Callback()
                        {
                            public void onCompleted(Response response)
                            {
                                Log.d("trung", response.toString());
                            }
                        }
                ).executeAndWait();
                return null;
            }
        }.execute();

    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.first_partner_btLoginFaceBook:
                onClickLogin();
                Intent intent = new Intent(this, LoginFaceBookActivity.class);
                startActivity(intent);
                break;
        }
    }
}