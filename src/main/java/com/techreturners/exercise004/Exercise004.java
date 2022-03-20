package com.techreturners.exercise004;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Exercise004 {

    final LocalDateTime date_value;
    private final int GIGA_SECONDS = 1000000000;
    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd.HH:mm:ss");

    public Exercise004(LocalDate date) {
        this.date_value = LocalDateTime.of(date, LocalTime.MIDNIGHT);
    }

    public Exercise004(String date) {
        try {
            this.date_value = LocalDateTime.parse(date, FORMATTER);
        }catch (DateTimeParseException e){
            throw new DateTimeException("Invalid Date");
        }
    }

    public Exercise004(LocalDateTime dateTime) {
        this.date_value = dateTime;
    }

    public LocalDateTime getDateTime() {
        return this.date_value.plusSeconds(GIGA_SECONDS);
    }
}
