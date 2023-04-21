package com.techie.springbootkafka.producer;

import com.techie.springbootkafka.dto.Message;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducerCustomObject {
    private final KafkaTemplate<String, Message> kafkaTemplate;
    public void produce(String message){
        log.info("Producing message object to Kafka");
        kafkaTemplate.send("demo-topic-message", new Message(message));
    }
}
