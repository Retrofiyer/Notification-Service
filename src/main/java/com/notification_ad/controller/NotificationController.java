package com.notification_ad.controller;

import com.notification_ad.entities.Email;
import com.notification_ad.service.NotificationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/email")
@Tag(name = "Api rest for brands use Swagger 3 - Notification")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping("/sendMessage")
    @Operation(summary = "This endpoint is used to send message for user")
    public ResponseEntity<?> receiveRequestEmail(@RequestBody Email email) {
        System.out.println("Email received: " + email);

        notificationService.sendEmail(email.getToUser(), email.getSubject(), email.getMessage());

        Map<String, String> response = new HashMap<>();
        response.put("status", "Send");
        return ResponseEntity.ok(response);
    }
}
