package com.emlakburada.emlakburada.converter;

import com.emlakburada.emlakburada.domain.Advert;
import com.emlakburada.emlakburada.domain.User;
import com.emlakburada.emlakburada.model.request.AdvertRequest;
import com.emlakburada.emlakburada.model.response.AdvertResponse;
import org.springframework.stereotype.Component;

@Component
public class AdvertConverter {

    private int advertNo = 1000;

    public AdvertResponse convert(Advert advert) {
        return AdvertResponse.builder()
                .user(advert.getUser())
                .advertNo(advert.getAdvertNo())
                .title(advert.getTitle())
                .price(advert.getPrice())
                .build();
    }

    public Advert convert(AdvertRequest advertRequest, User user) {
        return Advert.builder()
                .user(user)
                .advertNo(advertNo++)
                .title(advertRequest.getTitle())
                .price(advertRequest.getPrice())
                .duration(advertRequest.getDuration())
                .build();
    }
}