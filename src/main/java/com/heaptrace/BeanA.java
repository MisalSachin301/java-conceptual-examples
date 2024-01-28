package com.heaptrace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
    @Autowired
    @Lazy
    private BeanB beanB;

//    @Autowired
//    public void setBeanB(BeanB beanB) {
//        this.beanB = beanB;
//    }
}
