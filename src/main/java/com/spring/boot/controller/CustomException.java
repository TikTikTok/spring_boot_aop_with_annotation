package com.spring.boot.controller;

public class CustomException extends Exception {

    public CustomException(String message)
    {
       super(message);
    }
}
