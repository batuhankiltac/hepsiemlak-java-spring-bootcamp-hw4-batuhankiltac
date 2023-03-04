package com.emlakburada.emlakburadabanner.model.request;

import com.emlakburada.emlakburadabanner.domain.Address;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
public class AddressRequest extends Address {

    private Integer id;
    private String province;
    private String district;
    private String details;
}