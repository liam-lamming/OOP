package src;

import java.util.UUID;

public class TextLog extends Log {
    private String textContent;
    
    public TextLog(UUID id, String name, String description, String date, String textContent) {
        super(id, name, description, date);
        this.textContent = textContent;
    }
    
    public String getTextContent() {
        return textContent;
    }
    
    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }
    
    // Override methods for specific actions
    @Override
    public void create() {
        System.out.println("TextLog created: " + getName());
    }
    
    @Override
    public void read() {
        System.out.println("TextLog read: " + getName());
    }
    
    @Override
    public void update() {
        System.out.println("TextLog updated: " + getName());
    }
    
    @Override
    public void delete() {
        System.out.println("TextLog deleted: " + getName());
    }
    
    // Additional method specific to TextLog
    public void saveContent(String content) {
        System.out.println("Content saved for " + getName() + ": " + content);
    }
    
    // Placeholder for translation action
    public void translateContent() {
        System.out.println("Text translated for " + getName());
    }
}
