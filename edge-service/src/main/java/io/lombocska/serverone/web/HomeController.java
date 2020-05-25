package io.lombocska.serverone.web;

import io.lombocska.serverone.client.PlatformServiceProducerClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HomeController {

    private PlatformServiceProducerClient platformServiceProducerClient;

    public HomeController(final PlatformServiceProducerClient platformServiceProducerClient) {
        this.platformServiceProducerClient = platformServiceProducerClient;
    }

    @GetMapping("/")
    public String home() {
        log.info("Handling home");
        return this.platformServiceProducerClient.getCat();
    }

}
