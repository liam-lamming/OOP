package src;

import java.util.UUID;

public class VideoLog extends Log {
    private byte[] videoContent;
    
    public VideoLog(UUID id, String name, String description, String date, byte[] videoContent) {
        super(id, name, description, date);
        this.videoContent = videoContent;
    }
    
    public byte[] getVideoContent() {
        return videoContent;
    }
    
    public void setVideoContent(byte[] videoContent) {
        this.videoContent = videoContent;
    }
    
    // Override methods for specific actions
    @Override
    public void create() {
        System.out.println("VideoLog created: " + getName());
    }
    
    @Override
    public void read() {
        System.out.println("VideoLog read: " + getName());
    }
    
    @Override
    public void update() {
        System.out.println("VideoLog updated: " + getName());
    }
    
    @Override
    public void delete() {
        System.out.println("VideoLog deleted: " + getName());
    }
    
    // Placeholder for transcoding action
    public void transcodeVideo() {
        System.out.println("Video transcoded for " + getName());
    }
    
    // Placeholder for close-captioning action
    public void addCloseCaption() {
        System.out.println("Close caption added for " + getName());
    }
}
