package com.example.SexPartner.dto;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Jodie Pham on 9/23/14.
 */
public class DataUrlDTO
{
    @SerializedName("url")
    private String url;
    @SerializedName("is_silhouette")
    private Boolean is_silhouette;

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public Boolean getIs_silhouette()
    {
        return is_silhouette;
    }

    public void setIs_silhouette(Boolean is_silhouette)
    {
        this.is_silhouette = is_silhouette;
    }
}
