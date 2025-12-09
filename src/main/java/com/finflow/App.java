package com.finflow;

public class App {
    public static void main(String[] args) {
        System.out.println("Velocity Banking API is running...");
    }

    public String processTransaction(double amount) {
        if (amount <= 0) {
            return "Error: Invalid Amount";
        }
        if (amount > 10000) {
            return "Flagged: AML Review Required";
        }
        return "Success: Transaction Processed";
    }
}

