package com.example.SexPartner.dto;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Jodie Pham on 9/23/14.
 */
public class UserDTO
{
    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("picture")
    private PictureDTO pictureDTO;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public PictureDTO getPictureDTO()
    {
        return pictureDTO;
    }

    public void setPictureDTO(PictureDTO pictureDTO)
    {
        this.pictureDTO = pictureDTO;
    }
}
