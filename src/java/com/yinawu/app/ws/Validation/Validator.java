package com.yinawu.app.ws.Validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;

import java.lang.annotation.Annotation;

/**
 * Created by ywu on 7/28/18.
 */
public abstract class Validator<T> {

    public abstract String validate(T model);
}
