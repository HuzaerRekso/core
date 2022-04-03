package com.huzaer.core.exception;

import com.huzaer.core.payload.Status;

;

public class ApplicationException extends RuntimeException {

    private Status status;

    public ApplicationException() {
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ApplicationException(Status status) {
        super(status.getResponsemessage());
        this.status = status;
    }
}
