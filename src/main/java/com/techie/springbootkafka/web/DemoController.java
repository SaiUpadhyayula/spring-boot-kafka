package com.techie.springbootkafka.web;

import com.techie.springbootkafka.producer.KafkaProducer;
import com.techie.springbootkafka.producer.KafkaProducerCustomObject;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
@RequiredArgsConstructor
public class DemoController {

    private final KafkaProducer kafkaProducer;
    private final KafkaProducerCustomObject kafkaProducerCustomObject;

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void hello() {
        kafkaProducer.produce();
    }

    @GetMapping("/message")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void helloMessage() {
        kafkaProducerCustomObject.produce("Hello World");
    }
}
