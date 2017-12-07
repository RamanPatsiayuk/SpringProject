package com.spring.app.task2;

import com.spring.app.NewApp;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("task2.xml");
        System.out.println("Getting bean A");
        context.getBean("a");
        System.out.println("Getting bean B");
        context.getBean("b");
        System.out.println("Getting bean A");
        context.getBean("a");
        System.out.println("Getting bean B");
        context.getBean("b");
        context.close();
    }
}
