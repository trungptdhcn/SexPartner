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
    @DatabaseField(columnName = "USER_ID")
    protected String userId;
    @DatabaseField(columnName = "_ID", generatedId = true)
    private Long id;
    @DatabaseField(columnName = "USER_NAME")
    private Long userName;
    @DatabaseField(columnName = "URL_PHOTO")
    private Long urlPhoto;

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

    public Long getUserName()
    {
        return userName;
    }

    public void setUserName(Long userName)
    {
        this.userName = userName;
    }

    public Long getUrlPhoto()
    {
        return urlPhoto;
    }

    public void setUrlPhoto(Long urlPhoto)
    {
        this.urlPhoto = urlPhoto;
    }
}
