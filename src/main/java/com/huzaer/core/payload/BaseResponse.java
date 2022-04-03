package com.huzaer.core.payload;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huzaer.core.BaseObject;

/**
 * @author  Mohammad Huzaer Rekso Jiwo
 * @version 0.1
 * @since   2022-04-02
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponse<T> extends BaseObject {

    @JsonProperty("status")
    protected Status status;

    @JsonProperty("paging")
    protected Paging paging;

    @JsonProperty("result")
    protected T result;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

}
