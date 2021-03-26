package com.example.zadanie3_spring;

import com.example.zadanie3_spring.service.InvoiceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("cache-config.xml");

        InvoiceService invoiceService = (InvoiceService) context.getBean("invoiceService");


        System.out.println("Getting data from server:");
        System.out.println(invoiceService.getInvoice("1"));
        System.out.println(invoiceService.getInvoice("2"));
        System.out.println(invoiceService.getInvoice("1"));
        System.out.println(invoiceService.getInvoice("1"));
        System.out.println(invoiceService.getInvoice("2"));
        System.out.println(invoiceService.getInvoice("2"));


    }
}
