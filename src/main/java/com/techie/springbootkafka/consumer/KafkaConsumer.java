package com.techie.springbootkafka.consumer;

import com.techie.springbootkafka.dto.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "demo-topic", groupId = "demoGroup")
    public void consume(String message){
        log.info("Consumed message: {}", message);
    }

    @KafkaListener(topics = "demo-topic-message", groupId = "demoGroup")
    public void consumeMessage(Message message){
        log.info("Consumed message object: {}", message.message());
    }
}
