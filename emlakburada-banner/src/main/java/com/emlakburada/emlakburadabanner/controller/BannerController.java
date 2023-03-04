package com.emlakburada.emlakburadabanner.controller;

import com.emlakburada.emlakburadabanner.model.request.BannerRequest;
import com.emlakburada.emlakburadabanner.model.response.BannerResponse;
import com.emlakburada.emlakburadabanner.service.banner.BannerService;
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
@RequestMapping(value = "/banners")
public class BannerController {
    private final BannerService bannerService;

    @PostMapping
    public BannerResponse addBanner(@RequestBody BannerRequest bannerRequest) {
        return bannerService.add(bannerRequest);
    }

    @GetMapping
    public List<BannerResponse> getAllBanners() {
        return bannerService.getAll();
    }

    @PutMapping
    public BannerResponse updateBanner(@RequestBody BannerRequest bannerRequest) {
        return bannerService.update(bannerRequest);
    }

    @DeleteMapping
    public void deleteBanner(@RequestParam Integer id) {
        bannerService.delete(id);
    }
}