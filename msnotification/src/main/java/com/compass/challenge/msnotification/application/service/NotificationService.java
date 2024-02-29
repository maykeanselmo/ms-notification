package com.compass.challenge.msnotification.application.service;

import com.compass.challenge.msnotification.application.Notification;
import com.compass.challenge.msnotification.application.dto.DataNotification;
import com.compass.challenge.msnotification.application.dto.mapper.NotificationMapper;
import com.compass.challenge.msnotification.infra.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationService {
    private final NotificationRepository notificationRepository;

    public Notification createNotification(DataNotification dataNotification) {
            Notification notification = NotificationMapper.toNotification(dataNotification);
            return notificationRepository.save(notification);


    }
}
