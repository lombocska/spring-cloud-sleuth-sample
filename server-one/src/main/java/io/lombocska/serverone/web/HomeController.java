package io.lombocska.serverone.web;

import io.lombocska.serverone.client.ServerTwoClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HomeController {

    private ServerTwoClient serverTwoClient;

    public HomeController(final ServerTwoClient serverTwoClient) {
        this.serverTwoClient = serverTwoClient;
    }

    @GetMapping("/")
    public String home() {
        log.info("Handling home");
        return serverTwoClient.getCat();
    }

}
