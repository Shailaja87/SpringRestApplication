package com.example.demo;

import java.time.LocalDateTime;

public class ErrorDetails {

    String description;
    String Message;
    LocalDateTime localDateTime;

    public ErrorDetails(String description, String message, LocalDateTime localDateTime) {
        this.description = description;
        Message = message;
        this.localDateTime = localDateTime;
    }
    public String getDesc() {
        return description;
    }

    public String getMessage() {
        return Message;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}
