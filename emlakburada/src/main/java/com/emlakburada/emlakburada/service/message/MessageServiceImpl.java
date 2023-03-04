package com.emlakburada.emlakburada.service.message;

import com.emlakburada.emlakburada.converter.MessageConverter;
import com.emlakburada.emlakburada.domain.Message;
import com.emlakburada.emlakburada.model.request.MessageRequest;
import com.emlakburada.emlakburada.model.response.MessageResponse;
import com.emlakburada.emlakburada.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {
    private final MessageRepository messageRepository;
    private final MessageConverter messageConverter;

    @Override
    public List<MessageResponse> getAll() {
        return messageRepository.findAll().stream()
                .map(messageConverter::convert)
                .collect(Collectors.toList());
    }

    @Override
    public MessageResponse add(MessageRequest messageRequest) {
        Message message = messageConverter.convert(messageRequest);
        return messageConverter.convert(messageRepository.save(message));
    }

    @Override
    public MessageResponse update(MessageRequest messageRequest) {
        Message message = messageConverter.convert(messageRequest);
        return messageConverter.convert(messageRepository.save(message));
    }

    @Override
    public void delete(Integer id) {
        messageRepository.deleteById(id);
    }
}