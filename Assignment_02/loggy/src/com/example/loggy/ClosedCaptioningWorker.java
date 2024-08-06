package com.example.loggy;

import java.util.concurrent.BlockingQueue;

public class ClosedCaptioningWorker implements Runnable {
    private final BlockingQueue<Recording> queue;

    public ClosedCaptioningWorker(BlockingQueue<Recording> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Recording recording = queue.take();
                processRecording(recording);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void processRecording(Recording recording) {
        try {
            // Simulate sending to an external service and getting a callback
            sendToExternalService(recording);
            String caption = getClosedCaptioningFromService(recording);
            recording.setClosedCaptioning(caption);
            System.out.println("Processed: " + recording);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void sendToExternalService(Recording recording) throws InterruptedException {
        // Simulate network delay
        Thread.sleep(1000);
        System.out.println("Sent to external service: " + recording);
    }

    private String getClosedCaptioningFromService(Recording recording) throws InterruptedException {
        // Simulate processing delay
        Thread.sleep(recording.getLength() * 1000L);
        return "Closed captioning for media ID: " + recording.getId();
    }
}
