package com.riakoader.was.httpmessage;

public enum HttpStatus {

    OK(200, "OK");

    final int code;
    final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return code + " " + message;
    }
}