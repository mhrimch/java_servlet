package com.mohammed.hrimch.hrservlet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("starting...");

        // Lade die beans.xml aus dem classpath
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Employee employee = (Employee) context.getBean("emp");
        employee.saySalam("Mohammed Hrimch" );
    }



}
