package proj3.newsletter.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proj3.newsletter.Models.Newsletter;
import proj3.newsletter.Repositories.NewsletterRepository;

@Service
public class NewsletterServiceImpl implements NewsletterService {

    @Autowired
    NewsletterRepository newsletterRepository;

    @Override
    public Newsletter createNewsletterEntry(Newsletter newEntry) {
        return newsletterRepository.save(newEntry);
    }
}
