package PROJECT;

public class Message {
    private String sender;
    private String receiver;
    private String content;
    private boolean isRideRequest;

    public Message(String sender, String receiver, String content, boolean isRideRequest) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.isRideRequest = isRideRequest;
    }

    // Getters and Setters
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isRideRequest() {
        return isRideRequest;
    }

    public void setRideRequest(boolean rideRequest) {
        isRideRequest = rideRequest;
    }
}
