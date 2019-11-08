package proj3.newsletter.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import proj3.newsletter.Models.Newsletter;

@Repository
public interface NewsletterRepository extends CrudRepository<Newsletter, Long> {
    // i don't think i need to add any custom methods here
}
