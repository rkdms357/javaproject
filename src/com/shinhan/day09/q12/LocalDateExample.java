package com.shinhan.day09.q12;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime endDay = LocalDateTime.of(today.getYear(), 12, 31, 0, 0);

        Duration d = Duration.between(today, endDay);
        System.out.println(Math.abs(d.toDays()) + "일 남음");
    }
}