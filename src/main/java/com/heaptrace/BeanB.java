package com.heaptrace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
    @Autowired
    private BeanA beanA;

//    @Autowired
//    public void setBeanA(BeanA beanA) {
//        this.beanA = beanA;
//    }
}
