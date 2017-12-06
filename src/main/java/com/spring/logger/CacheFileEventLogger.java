package com.spring.logger;

import com.spring.models.Event;

import java.util.List;

public class CacheFileEventLogger extends FileEventLogger {

    private int cacheSize;
    private List<Event> cache;

    public CacheFileEventLogger(String fileName) {
        super(fileName);
    }

    public void logEvent(Event event) {

        cache.add(event);

        if(cache.size() == cacheSize){
            writeEventsFromCache();
            cache.clear();
        }
    }

    private void writeEventsFromCache() {

    }

    public void destroy(){
        if(!cache.isEmpty())
            writeEventsFromCache();
    }

}
