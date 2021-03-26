package com.example.zadanie3_spring.repository;

import com.example.zadanie3_spring.model.Invoice;

public interface InvoiceRepository {

    Invoice find(String invoiceNumber);

}
