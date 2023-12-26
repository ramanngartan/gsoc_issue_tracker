package issue_tracker.issuetracker.controller;

import issue_tracker.issuetracker.entity.issue;
import issue_tracker.issuetracker.repository.issueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/issues")
public class issueController {

    @Autowired
    private issueRepository issueRepository;

    @GetMapping
    public List<issue> getAllissues() {
        return issueRepository.findAll();
    }

    @PostMapping
    public issue createissue(@RequestBody issue issue) {
        return issueRepository.save(issue);
    }

    // Add other CRUD operations as needed
}
