package com.emlakburada.emlakburada.service.advert;

import com.emlakburada.emlakburada.client.BannerClient;
import com.emlakburada.emlakburada.converter.AdvertConverter;
import com.emlakburada.emlakburada.domain.Advert;
import com.emlakburada.emlakburada.domain.User;
import com.emlakburada.emlakburada.model.request.AdvertRequest;
import com.emlakburada.emlakburada.model.request.BannerRequest;
import com.emlakburada.emlakburada.model.response.AdvertResponse;
import com.emlakburada.emlakburada.queue.QueueService;
import com.emlakburada.emlakburada.repository.AdvertRepository;
import com.emlakburada.emlakburada.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AdvertServiceImpl implements AdvertService {
    private final AdvertRepository advertRepository;
    private final UserRepository userRepository;
    private final BannerClient bannerClient;
    private final QueueService queueService;
    private final AdvertConverter advertConverter;

    @Override
    public List<AdvertResponse> getAll() {
        return advertRepository.findAll().stream()
                .map(advertConverter::convert)
                .collect(Collectors.toList());
    }

    @Override
    public AdvertResponse add(AdvertRequest advertRequest) {
        User user = userRepository.findById(advertRequest.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found."));
        Advert advert = advertConverter.convert(advertRequest, user);
        String email = "batuhan@gmail.com " + advertRequest.getUserId();
        queueService.sendMessage(email);
        BannerRequest bannerRequest = new BannerRequest();
        bannerClient.saveBanner(bannerRequest);
        return advertConverter.convert(advertRepository.save(advert));
    }

    @Override
    public AdvertResponse update(AdvertRequest advertRequest) {
        User user = userRepository.findById(advertRequest.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found."));
        Advert advert = advertConverter.convert(advertRequest, user);
        return advertConverter.convert(advertRepository.save(advert));
    }

    @Override
    public void delete(Integer id) {
        advertRepository.deleteById(id);
    }
}