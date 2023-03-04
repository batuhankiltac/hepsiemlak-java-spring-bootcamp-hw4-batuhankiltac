package com.emlakburada.emlakburada.service.advert;

import com.emlakburada.emlakburada.model.request.AdvertRequest;
import com.emlakburada.emlakburada.model.response.AdvertResponse;

import java.util.List;

public interface AdvertService {
    List<AdvertResponse> getAll();
    AdvertResponse add(AdvertRequest advertRequest);
    AdvertResponse update(AdvertRequest advertRequest);
    void delete(Integer id);
}