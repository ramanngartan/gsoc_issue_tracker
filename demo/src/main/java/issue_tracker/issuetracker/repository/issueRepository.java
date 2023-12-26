package issue_tracker.issuetracker.repository;

import issue_tracker.issuetracker.entity.issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface issueRepository extends JpaRepository<issue, Long> {
    // Custom queries if needed
}
