package com.notification_ad.message;

import com.notification_ad.entities.UserNotification;
import com.notification_ad.service.NotificationService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMessageConsumer {

    @Autowired
    private NotificationService notificationService;

    @RabbitListener(queues = "email.queue")
    public void consumeMessage(UserNotification userNotification) {
        System.out.println("Message receive : " + userNotification);

        if (userNotification.getToken() == null) {
            System.out.println("Token is null for user: " + userNotification.getId());
        } else {
            System.out.println("Token receive: " + userNotification.getToken());
        }
        notificationService.reciveMail(userNotification);
    }
}
