package io.lombocska.servertwo.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping
public class CatController {

    @GetMapping("/cat")
    public String home() {
        log.info("Handling cat");
        return "Hello Cat";
    }

}
