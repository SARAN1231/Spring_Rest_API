package com.saran.REST_API;

//advanced class to receive the data from client to server without using getter and setter method
public record OrderRecord(
        String customerName,
        String productName,
        int id
) {
}
