package com.emlakburada.emlakburada.converter;

import com.emlakburada.emlakburada.model.request.MessageRequest;
import com.emlakburada.emlakburada.model.response.MessageResponse;
import com.emlakburada.emlakburada.domain.Message;
import org.springframework.stereotype.Component;

@Component
public class MessageConverter {

    public MessageResponse convert(Message message) {
        return MessageResponse.builder()
                .title(message.getTitle())
                .description(message.getDescription())
                .build();
    }

    public Message convert(MessageRequest messageRequest) {
        return Message.builder()
                .title(messageRequest.getTitle())
                .description(messageRequest.getDescription())
                .build();
    }
}