package com.emlakburada.emlakburadabanner.model.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AddressResponse {
    private Integer id;
    private String province;
    private String district;
    private String details;
}