package com.ghp.demo.myaspectjlogin.app.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * author: gaogq
 * time: 2019/2/25 13:49
 * description: 需要登陆验证的切点
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginTrace {
    int type();
}
