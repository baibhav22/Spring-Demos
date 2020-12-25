package model;

public class Event {

    private int eventId;

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", eventName='" + eventName + '\'' +
                ", eventType='" + eventType + '\'' +
                ", storeId='" + storeId + '\'' +
                '}';
    }

    private String eventName;
    private String eventType;
    private String storeId;

    public Event(int eventId, String eventName, String eventType, String storeId) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventType = eventType;
        this.storeId = storeId;
    }


    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }



}
