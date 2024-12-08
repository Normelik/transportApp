package com.simple.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "windows")
@Builder
public class Window {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String unloadingPlace;
//    private LocalDate date;
//    private LocalTime time;
//    private String supplier;
//    private String comment;
    private String plateNumber;
//    private LocalDateTime createdAt;
//    private LocalDateTime updatedAt;
//    private String updatedBy;
//    private String createdBy;
}
