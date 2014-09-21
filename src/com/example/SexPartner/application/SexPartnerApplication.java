
package com.example.SexPartner.application;

import android.app.Application;
import com.facebook.model.GraphPlace;
import com.facebook.model.GraphUser;

import java.util.List;

/**
 * User: Khiemvx
 * Date: 9/19/2014
 */
public class SexPartnerApplication extends Application
{

    private List<GraphUser> selectedUsers;
    private GraphPlace selectedPlace;

    public List<GraphUser> getSelectedUsers()
    {
        return selectedUsers;
    }

    public void setSelectedUsers(List<GraphUser> users)
    {
        selectedUsers = users;
    }

    public GraphPlace getSelectedPlace()
    {
        return selectedPlace;
    }

}
