package com.project.brunojdsz.arquiteturaspring;

import com.project.brunojdsz.arquiteturaspring.todos.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationAccessEmail {

    @Autowired
    private AppProperties appProperties;

}
