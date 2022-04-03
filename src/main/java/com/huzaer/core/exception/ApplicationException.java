package com.huzaer.core.exception;

import com.huzaer.core.payload.Status;

/**
 * This class is a custom exception used for
 * custom message
 *
 * @author  Mohammad Huzaer Rekso Jiwo
 * @version 0.1
 * @since   2022-04-02
 */
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
