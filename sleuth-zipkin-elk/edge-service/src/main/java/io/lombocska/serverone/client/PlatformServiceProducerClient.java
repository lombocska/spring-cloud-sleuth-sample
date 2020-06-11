package io.lombocska.serverone.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        contextId = "lombocska",
        name = "platformServiceProducerFeignClient",
        url = "${edge-service.resource-url.platform-service-producer}",
        decode404 = true)
public interface PlatformServiceProducerClient {

    @GetMapping(value = "/cat")
    String getCat();

}
