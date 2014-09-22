package com.example.SexPartner.utils;

import android.app.Activity;
import android.content.Intent;
import android.graphics.*;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import com.example.SexPartner.backend.model.ormlite.DatabaseHelper;
import com.j256.ormlite.android.apptools.OpenHelperManager;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * User: khiemvx
 * Date: 9/22/14
 */
public class Utils
{
    public static DatabaseHelper getHelper(Activity activity)
    {
        return (DatabaseHelper) OpenHelperManager.getHelper(activity, DatabaseHelper.class);
    }
}
