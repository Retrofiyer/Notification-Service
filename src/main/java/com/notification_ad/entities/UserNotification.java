package com.notification_ad.entities;

import lombok.Data;

@Data
public class UserNotification {
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private Boolean enabled;

    private String token;
}