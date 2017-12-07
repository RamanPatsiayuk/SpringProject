package com.spring.app;

import com.spring.interfaces.EventLogger;
import com.spring.logger.ConsoleEventLogger;
import com.spring.models.Client;
import com.spring.models.Event;
import com.spring.utils.EventType;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class App {

    private Client client;
    private EventLogger eventLogger;
    private Map<EventType, EventLogger> loggers;
    private Event event;

    public App(Client client, EventLogger eventLogger, Map<EventType, EventLogger> loggers) {
        this.client = client;
        this.eventLogger = eventLogger;
        this.loggers = loggers;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        App app = (App) context.getBean("app");
        //app.logEvent("Some event for user 1");
        //app.logEvent("Some event for user 2");
        context.close();
    }

    private void logEvent(EventType eventType, String msg) {
        EventLogger logger = loggers.get(eventType);
        if(logger == null){
            logger = eventLogger;
        }
        logger.logEvent(event);
    }
}
