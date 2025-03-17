package com.project.brunojdsz.arquiteturaspring.todos;

import org.springframework.stereotype.Component;

@Component
public class MailSender {

    public void sendMessage(String message){
        System.out.println("Sending email!");
    }
}
