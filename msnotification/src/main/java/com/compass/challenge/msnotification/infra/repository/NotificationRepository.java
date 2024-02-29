package com.compass.challenge.msnotification.infra.repository;

import com.compass.challenge.msnotification.application.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends MongoRepository<Notification,String> {
}
