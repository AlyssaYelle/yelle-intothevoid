package com.example.demo.Controllers;

import com.example.demo.Models.Newsletter;
import com.example.demo.Services.NewsletterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/newsletter")
public class NewsletterController {

    @Autowired
    NewsletterService newsletterService;

    @PostMapping("/subscribe")
    public Newsletter subscribe(@RequestBody Newsletter newsletter) {
        return newsletterService.createNewsletterEntry(newsletter);
    }
}
