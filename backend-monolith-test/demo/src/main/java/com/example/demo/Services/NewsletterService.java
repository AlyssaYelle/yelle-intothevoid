package com.example.demo.Services;

import com.example.demo.Models.Newsletter;

public interface NewsletterService {
    // want to allow people to add their info in order to subscribe to newsletter
    public Newsletter createNewsletterEntry(Newsletter newEntry);
}
