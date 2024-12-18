package RMI;

import java.io.Serializable;

public class Event implements Serializable {
    private String id;
    private String eventName;
    private String eventDate;
    private int expectedAttendance;
    private String eventCode;
    private static final long serialVersionUID = 20241131L;

    public Event() {
    }

    public Event(int expectedAttendance, String eventDate, String eventName, String id) {
        this.expectedAttendance = expectedAttendance;
        this.eventDate = eventDate;
        this.eventName = eventName;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getExpectedAttendance() {
        return expectedAttendance;
    }

    public void setExpectedAttendance(int expectedAttendance) {
        this.expectedAttendance = expectedAttendance;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventCode() {
        return eventCode;
    }

    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
    }
}
