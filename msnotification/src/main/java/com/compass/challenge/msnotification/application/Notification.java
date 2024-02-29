package com.compass.challenge.msnotification.application;

import com.compass.challenge.msnotification.application.enums.Event;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Document(collation = "events")
public class Notification {
    @Id
    private String id;
    @Email(message = "Formato inválido de email")
    @NotEmpty
    private String email;
    @NotNull(message = "O evento não pode ser nulo.")
    @Pattern(regexp = "CREATE|UPDATE|LOGIN|UPDATE_PASSWORD", message = "Evento inválido")
    private Event event;
    @NotNull
    private LocalDateTime date;

}
