package com.emlakburada.emlakburada.service.message;

import com.emlakburada.emlakburada.model.request.MessageRequest;
import com.emlakburada.emlakburada.model.response.MessageResponse;

import java.util.List;

public interface MessageService {
    List<MessageResponse> getAll();
    MessageResponse add(MessageRequest messageRequest);
    MessageResponse update(MessageRequest messageRequest);
    void delete(Integer id);
}