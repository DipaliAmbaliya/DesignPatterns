package com.example.observer.service;

import com.example.observer.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationService implements INotificationService {

    @Override
    public void sendUserRegisteredNotification(final User user) {
        System.out.println("sending mail to user");
    }
}
