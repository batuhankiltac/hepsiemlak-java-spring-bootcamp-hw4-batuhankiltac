package com.emlakburada.emlakburada.model.response;

import com.emlakburada.emlakburada.domain.enums.UserType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserResponse {
    private UserType userType;
    private String name;
    private String email;
    private String photo;
    private String bio;
}