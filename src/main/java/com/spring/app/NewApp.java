package com.spring.app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

public class NewApp {
    private static Map<String, List<String>> numbers;

    public NewApp(Map<String, List<String>> numbers) {
       this.numbers = numbers;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("example.xml");
        NewApp app = (NewApp) context.getBean("app");
        app.printMap(numbers);
        //app.logEvent("Some event for user 1");
        //app.logEvent("Some event for user 2");
        context.close();
    }

    private void printMap(Map<String, List<String>> numbers){
        System.out.println(numbers.entrySet());
    }
}
