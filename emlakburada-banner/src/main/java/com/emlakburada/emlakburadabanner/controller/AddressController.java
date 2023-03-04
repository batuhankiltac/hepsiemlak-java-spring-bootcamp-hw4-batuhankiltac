package com.emlakburada.emlakburadabanner.controller;

import com.emlakburada.emlakburadabanner.model.request.AddressRequest;
import com.emlakburada.emlakburadabanner.model.response.AddressResponse;
import com.emlakburada.emlakburadabanner.service.address.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/addresses")
public class AddressController {
    private final AddressService addressService;

    @PostMapping
    public AddressResponse addAddress(@RequestBody AddressRequest addressRequest) {
        return addressService.add(addressRequest);
    }

    @GetMapping
    public List<AddressResponse> getAllAddresses() {
        return addressService.getAll();
    }

    @PutMapping
    public AddressResponse updateAddress(@RequestBody AddressRequest addressRequest) {
        return addressService.update(addressRequest);
    }

    @DeleteMapping
    public void deleteAddress(@RequestParam Integer id) {
        addressService.delete(id);
    }
}