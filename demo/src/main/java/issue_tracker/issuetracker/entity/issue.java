package issue_tracker.issuetracker.entity;

import java.util.Date; // Import other necessary libraries as needed

public class issue {
    // Fields
    private Long id;
    private String title;
    private String description;
    private Date createdDate;
    // Add more fields as needed

    // Constructors, getters, and setters
    public issue() {
        // Default constructor
    }

    public issue(Long id, String title, String description, Date createdDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.createdDate = createdDate;
        // Initialize other fields as needed
    }

    // Getters and Setters for each field
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    // Additional methods if necessary
}
