package src;

import java.util.UUID;

public class AudioLog extends Log {
    private byte[] audioContent;
    
    public AudioLog(UUID id, String name, String description, String date, byte[] audioContent) {
        super(id, name, description, date);
        this.audioContent = audioContent;
    }
    
    public byte[] getAudioContent() {
        return audioContent;
    }
    
    public void setAudioContent(byte[] audioContent) {
        this.audioContent = audioContent;
    }
    
    // Override methods for specific actions
    @Override
    public void create() {
        System.out.println("AudioLog created: " + getName());
    }
    
    @Override
    public void read() {
        System.out.println("AudioLog read: " + getName());
    }
    
    @Override
    public void update() {
        System.out.println("AudioLog updated: " + getName());
    }
    
    @Override
    public void delete() {
        System.out.println("AudioLog deleted: " + getName());
    }
    
    // Placeholder for transcription action
    public void transcribeAudio() {
        System.out.println("Audio transcribed for " + getName());
    }
}
