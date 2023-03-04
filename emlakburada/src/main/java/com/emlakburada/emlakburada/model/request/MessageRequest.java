package com.emlakburada.emlakburada.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageRequest {
    private Integer id;
    private String title;
    private String description;
}