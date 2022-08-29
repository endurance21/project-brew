package com.example.forum.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GoogleUserDetails {

    private String name ;
    private String email ;
    private String image_url ;

    
}
