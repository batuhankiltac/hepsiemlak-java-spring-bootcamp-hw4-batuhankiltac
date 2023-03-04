package com.emlakburada.emlakburadabanner.model.response;

import com.emlakburada.emlakburadabanner.model.request.AddressRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@RequiredArgsConstructor
public class BannerResponse {
    private Integer advertNo;
    private String phone;
    private Integer quantity;
    private AddressRequest addressRequest;
}