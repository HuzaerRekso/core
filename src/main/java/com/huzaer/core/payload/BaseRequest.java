package com.huzaer.core.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huzaer.core.BaseObject;

/**
 * @author  Mohammad Huzaer Rekso Jiwo
 * @version 0.1
 * @since   2022-04-02
 */
public class BaseRequest<T> extends BaseObject {

    @JsonProperty("data")
    protected T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
