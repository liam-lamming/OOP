package src;

import java.util.UUID;

public class PhotoLog extends Log {
    private byte[] photoContent;
    
    public PhotoLog(UUID id, String name, String description, String date, byte[] photoContent) {
        super(id, name, description, date);
        this.photoContent = photoContent;
    }
    
    public byte[] getPhotoContent() {
        return photoContent;
    }
    
    public void setPhotoContent(byte[] photoContent) {
        this.photoContent = photoContent;
    }
    
    // Override methods for specific actions
    @Override
    public void create() {
        System.out.println("PhotoLog created: " + getName());
    }
    
    @Override
    public void read() {
        System.out.println("PhotoLog read: " + getName());
    }
    
    @Override
    public void update() {
        System.out.println("PhotoLog updated: " + getName());
    }
    
    @Override
    public void delete() {
        System.out.println("PhotoLog deleted: " + getName());
    }
    
    // Placeholder for annotation action
    public void annotatePhoto() {
        System.out.println("Photo annotated for " + getName());
    }
}
