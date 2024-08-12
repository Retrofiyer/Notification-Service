package com.notification_ad.service;

import com.notification_ad.entities.UserNotification;

public interface INotificationService {
    void sendEmail(String[] toUser, String subject, String message);
    void reciveMail(UserNotification userNotification);
}
