package com.kartikalabs.kllaundry.service;

/**
 *
 * @author Yanzen
 */
public class ErrorService {
    private boolean error;
    private String message;
    private String log;

    public ErrorService() {
    }

    public ErrorService(boolean error, String message, String log) {
        this.error = error;
        this.message = message;
        this.log = log;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }
    
    
}
