package com.emlakburada.emlakburada.queue;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Queue;

@Service
@RequiredArgsConstructor
public class RabbitMqService implements QueueService {
    private final AmqpTemplate rabbitTemplate;
    private final Queue queue;

    @Override
    public void sendMessage(String email) {
        rabbitTemplate.convertAndSend(String.valueOf(queue), email);
    }
}