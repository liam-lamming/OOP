package com.example.loggy;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClosedCaptioningController {
    private final BlockingQueue<Recording> queue;
    private final ExecutorService executorService;

    public ClosedCaptioningController(int queueSize, int poolSize) {
        this.queue = new ArrayBlockingQueue<>(queueSize);
        this.executorService = Executors.newFixedThreadPool(poolSize);

        for (int i = 0; i < poolSize; i++) {
            executorService.submit(new ClosedCaptioningWorker(queue));
        }
    }

    public void submitRecording(Recording recording) {
        try {
            queue.put(recording);
            System.out.println("Submitted: " + recording);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
