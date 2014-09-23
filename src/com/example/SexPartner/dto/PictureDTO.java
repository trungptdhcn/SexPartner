package com.example.SexPartner.dto;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Jodie Pham on 9/23/14.
 */
public class PictureDTO
{
    @SerializedName("data")
    private DataUrlDTO dataUrlDTO;

    public DataUrlDTO getDataUrlDTO()
    {
        return dataUrlDTO;
    }

    public void setDataUrlDTO(DataUrlDTO dataUrlDTO)
    {
        this.dataUrlDTO = dataUrlDTO;
    }
}
