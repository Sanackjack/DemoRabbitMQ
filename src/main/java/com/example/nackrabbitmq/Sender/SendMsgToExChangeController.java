package com.example.nackrabbitmq.Sender;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste2")
public class SendMsgToExChangeController {

    public SendMsgToExChangeController(RabbitTemplate queueSender) {
        this.queueSender = queueSender;
    }

    private final RabbitTemplate queueSender;

    @GetMapping
    public String send() throws JsonProcessingException {
        queueSender.convertAndSend("teste-exchange", "routing-key-teste", "test message eiei");
        return "ok. done";
    }
}