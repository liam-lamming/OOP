package com.example.loggy;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Demonstrate Log class functionality
        Log log1 = new Log("Log 1", "Description for log 1", new Date());
        log1.create();
        log1.read();
        log1.update("Updated Log 1", "Updated description for log 1");
        log1.read();
        log1.delete();

        // Existing functionality for ClosedCaptioningController
        ClosedCaptioningController controller = new ClosedCaptioningController(10, 5);

        for (int i = 1; i <= 15; i++) {
            Recording recording = new Recording(i, "media" + i, i);
            controller.submitRecording(recording);
        }

        controller.shutdown();
    }
}
