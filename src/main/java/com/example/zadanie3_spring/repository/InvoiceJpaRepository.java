package com.example.zadanie3_spring.repository;

import com.example.zadanie3_spring.model.Invoice;

public class InvoiceJpaRepository implements InvoiceRepository{

    @Override
    public Invoice find(final String invoiceNumber) {
        return new Invoice(invoiceNumber, null);
    }
}
