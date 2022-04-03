package com.example.nackrabbitmq.Sender;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")

public class SendMsgToQueueController {

    @Autowired
    private RabbitTemplate rabbitTemplate;
    @GetMapping
    public String send(){

        //***rabbitTemplate.convertAndSend('Name of Queue' , 'Message')
        rabbitTemplate.convertAndSend("teste", "eiei");
        return "ok. done";
    }

}