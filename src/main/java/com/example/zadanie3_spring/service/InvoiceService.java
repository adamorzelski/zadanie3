package com.example.zadanie3_spring.service;

import com.example.zadanie3_spring.model.Invoice;
import com.example.zadanie3_spring.repository.InvoiceRepository;

public class InvoiceService {

    private InvoiceRepository repository;

    public InvoiceService() {
    }

    public InvoiceService(InvoiceRepository repository) {
        this.repository = repository;
    }

    public Invoice getInvoice(String invoiceNumber) {
        simulateSlowService();
        return repository.find(invoiceNumber);
    }

    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
