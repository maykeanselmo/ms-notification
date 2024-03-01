package com.compass.challenge.msnotification.application.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class UserResponseDto {
    private String firstName;
    private String lastName;
    private String cpf;
    @JsonFormat(pattern = "dd-MM-yyyy")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate birthdate;
    private String email;
    private String cep;
    private String password;
    private boolean active;
}
