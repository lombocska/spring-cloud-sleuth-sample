package io.lombocska.serverthree.consumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
//@Transactional(value = "kafkaTransactionManager")
public class PlatformKafkaConsumer {

    @KafkaListener(topics = "${lombocska.kafka.topic}")
    public void process(final String message,
                        final @Header(KafkaHeaders.RECEIVED_PARTITION_ID) Integer partition,
                        final @Header(KafkaHeaders.OFFSET) Long offset) {

        log.info("Kafka Message received {} with offset: {} & partition: {}", message, offset, partition);
    }

}
