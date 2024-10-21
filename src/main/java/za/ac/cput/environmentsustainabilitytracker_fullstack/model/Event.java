package za.ac.cput.environmentsustainabilitytracker_fullstack.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;
    private String eventName;
    private LocalDate localDate;
    private String avatar;

    @Column(name = "Comment", length = 1000)
    private String comment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    
    public Event(){
        super();
    }
    
    public Event(Long eventId, String eventName, LocalDate localDate, String avatar, String comment, User user) {
        super();
        this.eventId = eventId;
        this.eventName = eventName;
        this.localDate = localDate;
        this.avatar = avatar;
        this.comment = comment;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
