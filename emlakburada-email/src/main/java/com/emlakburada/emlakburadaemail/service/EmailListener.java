package com.emlakburada.emlakburadaemail.service;

import com.emlakburada.emlakburadaemail.model.EmailMessage;
import com.emlakburada.emlakburadaemail.domain.Email;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class EmailListener {
    private final EmailService emailService;

    @RabbitListener(queues = "${emlakburada.rabbitmq.queue}")
    public void receiveMessage(String message) {
        EmailMessage emailMessage = new EmailMessage(message);
        Email email = new Email();
        email.setEmail(message.split(",")[0]);
        email.setId(Integer.parseInt(message.split(",")[1]));
        log.info(message);
        emailService.send(emailMessage.getEmail().split(",")[0]);
    }
}