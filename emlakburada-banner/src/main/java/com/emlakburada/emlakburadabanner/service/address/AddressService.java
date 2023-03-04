package com.emlakburada.emlakburadabanner.service.address;

import com.emlakburada.emlakburadabanner.model.request.AddressRequest;
import com.emlakburada.emlakburadabanner.model.response.AddressResponse;

import java.util.List;

public interface AddressService {
    List<AddressResponse> getAll();
    AddressResponse add(AddressRequest addressRequest);
    AddressResponse update(AddressRequest addressRequest);
    void delete(Integer id);
}