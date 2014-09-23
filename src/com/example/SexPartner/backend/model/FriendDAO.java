package com.example.SexPartner.backend.model;

import android.content.Context;
import com.example.SexPartner.backend.model.ormlite.DatabaseHelper;

import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created by Jodie Pham on 9/23/14.
 */
public class FriendDAO
{
    DatabaseHelper databaseHelper;

    public FriendDAO(DatabaseHelper databaseHelper)
    {
        this.databaseHelper = databaseHelper;
    }

    public Integer create(final List<Friend> friends) throws Exception
    {
        databaseHelper.getFriendDAO().callBatchTasks(new Callable<Integer>()
        {
            public Integer call() throws Exception
            {
                int affectedResult = 0;
                for (Friend friend : friends)
                {
                    affectedResult += databaseHelper.getFriendDAO().create(friend);
                }
                return affectedResult;
            }
        });
        return null;
    }
}
