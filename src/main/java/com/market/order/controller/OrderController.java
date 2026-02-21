package com.market.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/getDetails")
public class OrderController {
    private final RestTemplate restTemplate;

    OrderController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/sendHi")
    public String getMessage() {
        return restTemplate.getForObject("http://localhost:8081/getDetails/sendHi", String.class) + "to Order Service";
    }
}
