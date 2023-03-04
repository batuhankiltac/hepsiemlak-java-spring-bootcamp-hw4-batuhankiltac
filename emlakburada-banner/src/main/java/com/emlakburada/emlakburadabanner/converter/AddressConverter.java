package com.emlakburada.emlakburadabanner.converter;

import com.emlakburada.emlakburadabanner.domain.Address;
import com.emlakburada.emlakburadabanner.model.request.AddressRequest;
import com.emlakburada.emlakburadabanner.model.response.AddressResponse;
import org.springframework.stereotype.Component;

@Component
public class AddressConverter {

    public AddressResponse convert(Address address) {
        return AddressResponse.builder()
                .province(address.getProvince())
                .district(address.getDistrict())
                .details(address.getDetails())
                .build();
    }

    public Address convert(AddressRequest addressRequest) {
        return Address.builder()
                .province(addressRequest.getProvince())
                .district(addressRequest.getDistrict())
                .details(addressRequest.getDetails())
                .build();
    }
}