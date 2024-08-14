package com.notification_ad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.notification_ad.entities.UserNotification;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class NotificationService implements INotificationService {

    @Value("${email.sender}")
    private String emailUser;

    @Value("${token.service.url}")
    private String tokenUrl;

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void sendEmail(String[] toUser, String subject, String message) {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, "utf-8");
        try {
            messageHelper.setFrom(emailUser);
            messageHelper.setTo(toUser);
            messageHelper.setSubject(subject);
            messageHelper.setText(message, true);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        mailSender.send(mimeMessage);
    }

    @Override
    public void reciveMail(UserNotification userNotification) {
        String[] toUser = { userNotification.getEmail() };
        String subject = "Confirm your account";
        String message = "<p>Please confirm your account by clicking the link below:</p>" +
                "<a href=\"" + tokenUrl + "?token=" + userNotification.getToken() + "\">Confirm your account</a>";

        sendEmail(toUser, subject, message);
    }
}
