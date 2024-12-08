package com.simple.backend.DTOs;

import java.time.LocalDate;
import java.time.LocalTime;

public record RequestWindow(
        String unloadingPlace,
//        LocalDate date,
//        LocalTime time,
//        String supplier,
//        String comment,
        String plateNumber
) {
}
