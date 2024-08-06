package src;


import java.util.UUID;

public class Log {
    private UUID id;
    private String name;
    private String description;
    private String date;
    
    // Constructor with all attributes
    public Log(UUID id, String name, String description, String date) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
    }
    
    // Getters and setters
    public UUID getId() {
        return id;
    }
    
    public void setId(UUID id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDate() {
        return date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    
    // Mockup methods for create, read, update, delete
    public void create() {
        System.out.println("Log created: " + name);
    }
    
    public void read() {
        System.out.println("Log read: " + name);
    }
    
    public void update() {
        System.out.println("Log updated: " + name);
    }
    
    public void delete() {
        System.out.println("Log deleted: " + name);
    }
}

 
    

