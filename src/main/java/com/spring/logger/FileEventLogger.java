package com.spring.logger;

import com.spring.interfaces.EventLogger;
import com.spring.models.Event;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class FileEventLogger implements EventLogger {
    private String fileName;
    private File file;

    public FileEventLogger(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void logEvent(Event event) {
        //FileUtils.writeStringToFile();
    }

    public void init(){
        this.file = new File(fileName);
        if (file.canWrite()){

        }
    }
}
