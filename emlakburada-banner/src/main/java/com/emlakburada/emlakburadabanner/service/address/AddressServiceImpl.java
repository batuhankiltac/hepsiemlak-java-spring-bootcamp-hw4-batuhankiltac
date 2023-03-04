package com.emlakburada.emlakburadabanner.service.address;

import com.emlakburada.emlakburadabanner.converter.AddressConverter;
import com.emlakburada.emlakburadabanner.domain.Address;
import com.emlakburada.emlakburadabanner.model.request.AddressRequest;
import com.emlakburada.emlakburadabanner.model.response.AddressResponse;
import com.emlakburada.emlakburadabanner.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;
    private final AddressConverter addressConverter;

    @Override
    public List<AddressResponse> getAll() {
        return addressRepository.findAll().stream()
                .map(addressConverter::convert)
                .collect(Collectors.toList());
    }

    @Override
    public AddressResponse add(AddressRequest addressRequest) {
        Address address = addressConverter.convert(addressRequest);
        return addressConverter.convert(addressRepository.save(address));
    }

    @Override
    public AddressResponse update(AddressRequest addressRequest) {
        Address address = addressConverter.convert(addressRequest);
        return addressConverter.convert(addressRepository.save(address));
    }

    @Override
    public void delete(Integer id) {
        addressRepository.deleteById(id);
    }
}