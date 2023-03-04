package com.emlakburada.emlakburadabanner.service.banner;

import com.emlakburada.emlakburadabanner.model.request.BannerRequest;
import com.emlakburada.emlakburadabanner.model.response.BannerResponse;

import java.util.List;

public interface BannerService {
    List<BannerResponse> getAll();
    BannerResponse add(BannerRequest bannerRequest);
    BannerResponse update(BannerRequest bannerRequest);
    void delete(Integer id);
}