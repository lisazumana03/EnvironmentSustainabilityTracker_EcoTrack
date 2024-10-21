package za.ac.cput.environmentsustainabilitytracker_fullstack.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @Column(name ="username", nullable=false, length = 66)
    private String username;
    @Column(name = "name", nullable=false, length = 66)
    private String name;
    @Column(name = "email", nullable = false, unique=true, length = 48)
    private String email;
    
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Review> reviewList;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Event> eventList;

    public User(){
        super();
    }
    
    public User(Long userId, String username, String name, String email, String password){
        super();
        this.userId = userId;
        this.username = username;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public List<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(List<Review> reviewList) {
        this.reviewList = reviewList;
    }

    public List<Event> getCommentList() {
        return eventList;
    }

    public void setCommentList(List<Event> eventList) {
        this.eventList = eventList;
    }
}
