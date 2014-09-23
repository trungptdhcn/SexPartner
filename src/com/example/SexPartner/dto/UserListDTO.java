package com.example.SexPartner.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Jodie Pham on 9/23/14.
 */
public class UserListDTO
{
    @SerializedName("data")
    List<UserDTO> userDTOList;

    public List<UserDTO> getUserDTOList()
    {
        return userDTOList;
    }

    public void setUserDTOList(List<UserDTO> userDTOList)
    {
        this.userDTOList = userDTOList;
    }
}
