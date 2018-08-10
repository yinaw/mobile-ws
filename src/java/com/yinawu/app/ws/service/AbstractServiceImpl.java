package com.yinawu.app.ws.service;

import com.yinawu.app.ws.Validation.Custom;
import com.yinawu.app.ws.Validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;

import java.lang.annotation.Annotation;

/**
 * Created by ywu on 7/22/18.
 */
public abstract class AbstractServiceImpl<T> implements AbstractService<T> {

    @Autowired
    private AutowireCapableBeanFactory beanFactory;


    public T validate(T model) {
        Class clazz = model.getClass();

        if (clazz.isAnnotationPresent(Custom.class)) {

            Annotation annotation = clazz.getAnnotation(Custom.class);

            Custom customAnnotation = (Custom)annotation;

            Class<? extends Validator<T>> validator = customAnnotation.validator();

            Validator<T> validator1 = beanFactory.getBean(validator);

            String validationMsg = validator1.validate(model);
        }
        return model;
    }


    public T create(T dto) {
        // T result = new T();
        validate(dto);
        return dto;
    };
}
