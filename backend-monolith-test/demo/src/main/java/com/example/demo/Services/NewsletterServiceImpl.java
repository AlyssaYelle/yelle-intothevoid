package com.example.demo.Services;

import com.example.demo.Models.Newsletter;
import com.example.demo.Repositories.NewsletterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsletterServiceImpl implements NewsletterService {

    @Autowired
    NewsletterRepository newsletterRepository;

    @Override
    public Newsletter createNewsletterEntry(Newsletter newEntry) {
        return newsletterRepository.save(newEntry);
    }
}
