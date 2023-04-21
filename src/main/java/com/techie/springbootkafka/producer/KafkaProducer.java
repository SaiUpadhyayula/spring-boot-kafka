package com.techie.springbootkafka.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;
    public void produce(){
        log.info("Producing message to Kafka");
        kafkaTemplate.send("demo-topic", "Hello World");
    }
}
