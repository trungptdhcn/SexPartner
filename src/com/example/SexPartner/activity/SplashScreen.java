package com.example.SexPartner.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.example.SexPartner.R;

/**
 * Created by Jodie Pham on 9/3/14.
 */
public class SplashScreen extends Activity
{
    /**
     * Duration of wait *
     */
    private final int SPLASH_DISPLAY_LENGTH = 5000;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle icicle)
    {
        super.onCreate(icicle);
        setContentView(R.layout.splashscreen);

    }

    @Override
    protected void onResume()
    {
         /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(SplashScreen.this, UserGuideActivity.class);
                startActivity(mainIntent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        }, SPLASH_DISPLAY_LENGTH);
        super.onResume();
    }
}