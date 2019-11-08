package proj3.newsletter.Services;

import proj3.newsletter.Models.Newsletter;

public interface NewsletterService {
    // want to allow people to add their info in order to subscribe to newsletter
    public Newsletter createNewsletterEntry(Newsletter newEntry);
}
