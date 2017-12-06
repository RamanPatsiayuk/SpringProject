package com.spring.logger;

import com.spring.interfaces.EventLogger;
import com.spring.models.Event;

public class ConsoleEventLogger implements EventLogger {

   public void logEvent(Event event){
        System.out.println(event.toString());
    }
}
