package com.example.observer.newuser;

import com.example.observer.entity.User;
import org.springframework.context.ApplicationEvent;

public class NewUserEvent extends ApplicationEvent {

    private User user;

    public NewUserEvent(final Object source, final User user) {
        super(source);
        this.user = user;
    }

    public User getUser() {
        return this.user;
    }
}
