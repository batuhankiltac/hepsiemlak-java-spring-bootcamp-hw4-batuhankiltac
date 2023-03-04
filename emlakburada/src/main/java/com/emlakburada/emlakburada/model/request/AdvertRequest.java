package com.emlakburada.emlakburada.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdvertRequest {

    private Integer id;
    private Integer userId;
    private Integer advertNo;
    private String title;
    private Long price;
    private Integer duration;
}