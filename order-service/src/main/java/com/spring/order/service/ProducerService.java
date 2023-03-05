package com.spring.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ProducerService {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @Value("${kafka.topic}")
    private String topic;

    public Map<String,Integer> sendMsg(Map<String,Integer> order){
        kafkaTemplate.send(topic,order.toString());
        return order;
    }
}
