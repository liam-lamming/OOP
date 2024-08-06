package src;


import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        // Create instances for testing
        UUID logId = UUID.randomUUID();
        
        TextLog textLog = new TextLog(logId, "Text Log 1", "Description for Text Log 1", "2024-07-17", "Text content");
        PhotoLog photoLog = new PhotoLog(logId, "Photo Log 1", "Description for Photo Log 1", "2024-07-17", new byte[] { /* photo bytes */ });
        AudioLog audioLog = new AudioLog(logId, "Audio Log 1", "Description for Audio Log 1", "2024-07-17", new byte[] { /* audio bytes */ });
        VideoLog videoLog = new VideoLog(logId, "Video Log 1", "Description for Video Log 1", "2024-07-17", new byte[] { /* video bytes */ });
        
        // Test create, read, update, delete
        textLog.create();
        textLog.read();
        textLog.update();
        textLog.delete();
        
        photoLog.create();
        photoLog.read();
        photoLog.update();
        photoLog.delete();
        
        audioLog.create();
        audioLog.read();
        audioLog.update();
        audioLog.delete();
        
        videoLog.create();
        videoLog.read();
        videoLog.update();
        videoLog.delete();
        
        // Test specific actions
        textLog.saveContent("New content");
        photoLog.annotatePhoto();
        audioLog.transcribeAudio();
        videoLog.transcodeVideo();
        videoLog.addCloseCaption();
        
        // Test translation action
        TranslationAction translator = new TranslationAction();
        translator.translateTextLog(textLog);
    }
}
