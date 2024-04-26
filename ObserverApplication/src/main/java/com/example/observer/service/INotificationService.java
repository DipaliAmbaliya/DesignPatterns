package com.example.observer.service;

import com.example.observer.entity.User;

public interface INotificationService {

    void sendUserRegisteredNotification(User user);

}
