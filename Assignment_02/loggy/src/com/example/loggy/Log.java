package com.example.loggy;

import java.util.Date;
import java.util.UUID;

public class Log {
    private static int counter = 0;
    private int id;
    private String shortCode;
    private String name;
    private String description;
    private Date date;

    public Log(String name, String description, Date date) {
        this.id = ++counter;
        this.shortCode = generateShortCode();
        this.name = name;
        this.description = description;
        this.date = date;
    }

    public Log() {
        this("Unnamed Log", "No description", new Date());
    }

    private String generateShortCode() {
        return UUID.randomUUID().toString().substring(0, 11).replace("-", "");
    }

    public void create() {
        System.out.println("Log created: " + this);
    }

    public void read() {
        System.out.println("Log details: " + this);
    }

    public void update(String name, String description) {
        this.name = name;
        this.description = description;
        System.out.println("Log updated: " + this);
    }

    public void delete() {
        System.out.println("Log deleted: " + this);
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", shortCode='" + shortCode + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}
