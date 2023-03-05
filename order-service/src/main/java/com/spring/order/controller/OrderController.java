package com.spring.order.controller;

import com.spring.order.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class OrderController {

    @Autowired
    private ProducerService producerService;

    @GetMapping("create-order")
    public Map<String,Integer> GenerateOrder(@RequestParam("name")String name,@RequestParam("price")Integer price){
        Map<String,Integer> order = new HashMap<>();
        order.put(name,price);

        return producerService.sendMsg(order);
    }
}
