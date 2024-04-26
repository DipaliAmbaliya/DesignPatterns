package com.example.observer.newuser;

import com.example.observer.service.INotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SendUserRegisteredEmailHandler {

    @Autowired
    private INotificationService notificationService;

    @EventListener
    public void handleNewUserEvent(final NewUserEvent newUserEvent) {

        notificationService.sendUserRegisteredNotification(newUserEvent.getUser());

    }
}
