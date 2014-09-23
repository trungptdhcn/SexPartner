package com.example.SexPartner.backend.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * User: Khiemvx
 * Date: 9/22/2014
 */
@DatabaseTable(tableName = "FRIEND")
public class Friend
{
    @DatabaseField(columnName = "_ID", generatedId = true)
    private Long id;
    @DatabaseField(columnName = "USER_ID")
    protected String userId;
    @DatabaseField(columnName = "USER_NAME")
    private String userName;
    @DatabaseField(columnName = "URL_PHOTO")
    private String urlPhoto;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getUrlPhoto()
    {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto)
    {
        this.urlPhoto = urlPhoto;
    }
}
