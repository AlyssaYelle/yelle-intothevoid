package proj3.newsletter.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proj3.newsletter.Models.Newsletter;
import proj3.newsletter.Services.NewsletterService;

@RestController
@RequestMapping("/newsletter")
public class NewsletterController {

    @Autowired
    NewsletterService newsletterService;

    @PostMapping("/subscribe")
    @CrossOrigin(origins = "http://localhost:3000")
    public Newsletter subscribe(@RequestBody Newsletter newsletter) {
        return newsletterService.createNewsletterEntry(newsletter);
    }
}
