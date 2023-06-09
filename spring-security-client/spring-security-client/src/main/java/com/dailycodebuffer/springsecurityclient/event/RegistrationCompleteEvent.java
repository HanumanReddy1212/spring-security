package com.dailycodebuffer.springsecurityclient.event;

import com.dailycodebuffer.springsecurityclient.entity.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class RegistrationCompleteEvent extends ApplicationEvent {

    private User user;
    private String applicationUrl;// url for user to click
    public RegistrationCompleteEvent(User user, String applicationUrl) {
        super(user);
        this.user=user;
        this.applicationUrl=applicationUrl;
    }
}
