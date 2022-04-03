package com.huzaer.core.payload;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.huzaer.core.BaseObject;

/**
 * @author  Mohammad Huzaer Rekso Jiwo
 * @version 0.1
 * @since   2022-04-02
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Status extends BaseObject {

    public static final String SUCCESS_CODE = "0000";
    public static final String SUCCESS_DESC = "Success";

    public static final String ERROR_EXIST_CODE = "9002";
    public static final String ERROR_EXIST_DESC = "Data already exist";

    public static final String ERROR_NOTFOUND_CODE = "9003";
    public static final String ERROR_NOTFOUND_DESC = "Data Not Found";

    public static final String ERROR_INVALID_DATA_CODE = "9005";
    public static final String ERROR_INVALID_DATA_DESC = "Invalid Data";

    public static final String ERROR_CODE = "9999";
    public static final String ERROR_DESC = "Error";

    public Status() {
    }

    public Status(String responseCode, String responseDesc) {
        this.responseCode = responseCode;
        this.responseDesc = responseDesc;
    }

    public Status(String responseCode, String responseDesc, String responseMessage) {
        this.responseCode = responseCode;
        this.responseDesc = responseDesc;
        this.responseMessage = responseMessage;
    }

    private String responseCode;

    private String responseDesc;

    private String responseMessage;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseDesc() {
        return responseDesc;
    }

    public void setResponseDesc(String responseDesc) {
        this.responseDesc = responseDesc;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public static Status DATA_ALREADY_EXIST(String message) {
        return new Status(ERROR_EXIST_CODE, ERROR_EXIST_DESC, message);
    }

    public static Status SUCCESS() {
        return new Status(SUCCESS_CODE, SUCCESS_DESC);
    }

    public static Status SUCCESS(String message) {
        return new Status(SUCCESS_CODE, SUCCESS_DESC, message);
    }

    public static Status DATA_NOT_FOUND() {
        return new Status(ERROR_NOTFOUND_CODE, ERROR_NOTFOUND_DESC);
    }

    public static Status DATA_NOT_FOUND(String message) {
        return new Status(ERROR_NOTFOUND_CODE, ERROR_NOTFOUND_DESC, message);
    }

    public static Status INVALID(String message) {
        return new Status(ERROR_INVALID_DATA_CODE, ERROR_INVALID_DATA_DESC, message);
    }

    public static Status ERROR() {
        return new Status(ERROR_CODE, ERROR_DESC);
    }

    public static Status ERROR(String message) {
        return new Status(ERROR_CODE, ERROR_DESC, message);
    }
}
