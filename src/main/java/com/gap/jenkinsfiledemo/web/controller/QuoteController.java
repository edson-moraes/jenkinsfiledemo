package com.gap.jenkinsfiledemo.web.controller;

import com.gap.jenkinsfiledemo.model.resource.Quote;
import com.gap.jenkinsfiledemo.web.client.QuoteClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quotes")
public class QuoteController {

    private final QuoteClient quoteClient;

    @Autowired
    public QuoteController(QuoteClient quoteClient) {
        this.quoteClient = quoteClient;
    }

    @GetMapping(path = "/random")
    public Quote getRandomQuote() {
        return quoteClient.getRandomQuote();
    }
}
