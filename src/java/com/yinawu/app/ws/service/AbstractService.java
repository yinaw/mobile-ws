package com.yinawu.app.ws.service;

/**
 * Created by ywu on 8/10/18.
 */
public interface AbstractService<T> {
    public T create(T dto);

    public T validate(T dto);
}
