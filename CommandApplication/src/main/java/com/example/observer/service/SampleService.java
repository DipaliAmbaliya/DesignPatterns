package com.example.observer.service;

import com.example.observer.commands.CommandInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Component
public class SampleService implements SampleServiceInterface {

    @Autowired
    ApplicationContext context;

    @Autowired
    private Map<String, CommandInterface> commandHandlersMap;


    @Override
    public String routeParser(String command) {
        System.out.println("Path::"+command);

        String response = commandHandlersMap.get(command).execute();
        return response != null ? response : "No command found";
    }
}
