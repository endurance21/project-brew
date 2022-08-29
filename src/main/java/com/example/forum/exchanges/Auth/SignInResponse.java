package com.example.forum.exchanges.Auth;

import com.example.forum.models.dto.User;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SignInResponse {

    private User user_details ;
    private String jwt_token  ;
    
}
