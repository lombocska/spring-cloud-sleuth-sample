package io.lombocska.servertwo.web;

import io.lombocska.servertwo.dispatcher.KafkaDispatcher;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping
@RequiredArgsConstructor
public class CatController {

    private final KafkaDispatcher kafkaDispatcher;

    @GetMapping("/cat")
    public String home() {
        log.info("Handling cat");
        this.kafkaDispatcher.send("Very important kafka message.");
        return "Hello Cat, kafka";
    }

}
