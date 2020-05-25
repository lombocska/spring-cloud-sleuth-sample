package io.lombocska.servertwo.dispatcher;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
//@Transactional
@RequiredArgsConstructor
public class KafkaDispatcher {

    @Value("${lombocska.kafka.topic}")
    private String topic;

    private final KafkaTemplate kafkaTemplate;

    public void send(String event) {
        this.kafkaTemplate.send(topic, event);
        log.info("Event sent: {} to the topic: {}", event, topic);
    }

}
