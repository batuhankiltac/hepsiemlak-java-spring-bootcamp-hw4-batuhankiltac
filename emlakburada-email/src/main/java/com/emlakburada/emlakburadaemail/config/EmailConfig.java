package com.emlakburada.emlakburadaemail.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Setter
@Getter
@Configuration
public class EmailConfig {

    @Value("${smtpServer}")
    private String smtpServer;
    @Value("${smtpPort}")
    private String smtpPort;
    @Value("${username}")
    private String username;
    @Value("${password}")
    private String password;
    @Value("${from}")
    private String from;
    @Value("${subject}")
    private String subject;
}