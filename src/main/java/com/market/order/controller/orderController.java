package com.market.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getDetails")
public class orderController {

    @GetMapping("/sendHi")
    public String getMessage() {
        return "Hi, Hello from Order Service!";
    }
}
