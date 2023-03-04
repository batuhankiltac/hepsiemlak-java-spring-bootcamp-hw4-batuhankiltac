package com.emlakburada.emlakburadabanner.converter;

import com.emlakburada.emlakburadabanner.domain.Address;
import com.emlakburada.emlakburadabanner.domain.Banner;
import com.emlakburada.emlakburadabanner.model.request.AddressRequest;
import com.emlakburada.emlakburadabanner.model.request.BannerRequest;
import com.emlakburada.emlakburadabanner.model.response.BannerResponse;
import org.springframework.stereotype.Component;

@Component
public class BannerConverter {

    public BannerResponse convert(Banner banner) {
        BannerResponse bannerResponse = new BannerResponse();
        bannerResponse.setAdvertNo(banner.getAdvertNo());
        bannerResponse.setPhone(banner.getPhone());
        bannerResponse.setQuantity(banner.getQuantity());
        bannerResponse.setAddressRequest(new AddressRequest());
        return bannerResponse;
    }

    public Banner convert(BannerRequest bannerRequest, Address address) {
        return Banner.builder()
                .advertNo(bannerRequest.getAdvertNo())
                .phone(bannerRequest.getPhone())
                .quantity(bannerRequest.getQuantity())
                .address(address)
                .build();
    }
}