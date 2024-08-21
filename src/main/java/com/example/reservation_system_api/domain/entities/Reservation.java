package com.example.reservation_system_api.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Reservation {
    private Long id;
    private LocalDateTime dateTime;
    private int  number0fPeople;
    private Customer customer;
}
