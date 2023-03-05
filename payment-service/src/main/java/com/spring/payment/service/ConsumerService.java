package com.spring.payment.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ConsumerService {
    @KafkaListener(topics="${kafka.topic}")
    public void Consume(Message<String> order){

        System.out.println("payment successfull for "+order.getPayload());
    }
}
