package io.lombocska.serverone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ServerOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerOneApplication.class, args);
    }

}
