package com.gap.jenkinsfiledemo.web.client;

import com.gap.jenkinsfiledemo.model.resource.Quote;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "quotes", url = "https://api.quotable.io")
public interface QuoteClient {

    @GetMapping(path = "/random")
    public Quote getRandomQuote();
}
