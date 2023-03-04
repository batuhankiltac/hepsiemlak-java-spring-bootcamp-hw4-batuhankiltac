package com.emlakburada.emlakburada.model.response;

import com.emlakburada.emlakburada.domain.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AdvertResponse {
    private Integer advertNo;
    private String title;
    private Long price;
    private User user;
}