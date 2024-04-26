package com.example.observer.service;

import com.example.observer.entity.User;
import com.example.observer.newuser.NewUserEvent;
import com.example.observer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void registerUser(final User user) {
        userRepository.save(user);
        applicationEventPublisher.publishEvent(new NewUserEvent(this, user));
    }
}
