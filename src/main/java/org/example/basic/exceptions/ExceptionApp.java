package org.example.basic.exceptions;

public class ExceptionApp {

    public static void exceptionRequest(int code) throws ProductException {
        if (code >= 400 && code < 500){
            throw new ProductException("Client Error");
        }
        else if (code >= 500 && code < 600){
            throw new ProductException("Server Error");
        }
    }

    public static void reportRequest(int total){
        if (total == 0){
            throw new ReportException("Data order not counted");
        } else if (total < 0){
            throw new ReportException("Data order is less then 0");
        }
    }

    public static void main(String[] args) {
        try {
            exceptionRequest(200);
            System.out.println("200 OK");
            exceptionRequest(400);
        } catch (ProductException e) {
            System.out.println("data not valid : "+e.getMessage());
        } finally {
            System.out.println("response call data..");
        }

        reportRequest(-10);
    }
}
