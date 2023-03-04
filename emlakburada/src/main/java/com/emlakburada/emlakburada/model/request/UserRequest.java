package com.emlakburada.emlakburada.model.request;

import com.emlakburada.emlakburada.domain.enums.UserType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {

    private Integer id;
    private UserType userType;
    private String name;
    private String email;
    private String bio;
}