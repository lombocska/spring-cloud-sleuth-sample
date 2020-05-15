package io.lombocska.serverone.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "serverTwoClient",
        url = "${server-one.resource-url.server-two}",
        decode404 = true)
public interface ServerTwoClient {

    @GetMapping(value = "/cat")
    String getCat();

}
