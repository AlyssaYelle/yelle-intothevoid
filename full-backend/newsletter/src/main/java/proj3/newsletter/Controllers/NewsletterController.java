package proj3.newsletter.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proj3.newsletter.Models.Newsletter;
import proj3.newsletter.Services.NewsletterService;

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
