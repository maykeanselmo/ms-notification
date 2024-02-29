package com.compass.challenge.msnotification.infra.mqueue;

import com.compass.challenge.msnotification.application.dto.DataNotification;
import com.compass.challenge.msnotification.application.service.NotificationService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class NotificationSubscriber {

    private final NotificationService notificationService;

    @RabbitListener(queues = "${mq.queues.notifications}")
    public void receiveNotification(@Payload String payload) {
        try {
            log.info("Salvando a notificação");
            ObjectMapper mapper = new ObjectMapper().registerModule(new JavaTimeModule());
            DataNotification dataNotification = mapper.readValue(payload, DataNotification.class);
            notificationService.createNotification(dataNotification);
        }
        catch (JsonProcessingException e){
            e.printStackTrace();
        }


    }
}
