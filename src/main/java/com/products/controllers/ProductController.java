package com.products.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
public class ProductController {
    @GetMapping("/webhook")
    public ResponseEntity<Object> webhookGet() {
        log.info("GET WEBHOOK");
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PostMapping("/webhook")
    public ResponseEntity<Object> webhookPost(@RequestBody Object object) {
        log.info("POST WEBHOOK ");
        log.info(object.toString());
        return new ResponseEntity<>(object, HttpStatus.OK);
    }

}
