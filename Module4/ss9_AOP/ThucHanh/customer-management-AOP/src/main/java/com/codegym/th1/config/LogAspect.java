package com.codegym.th1.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Aspect
public class LogAspect {
    @Pointcut("execution(* com.codegym.th1.controller.CustomerController.listCustomers(..))")
    public void allMethodPointCut(){

    }

    @Before("allMethodPointCut()")
    public void beforeCallMethod(JoinPoint joinPoint){
        System.err.println("Start method name:" + joinPoint.getSignature().getName()
        + " Time: " + LocalDate.now());
    }

    @AfterReturning("allMethodPointCut()")
    public void afterCallMethod(JoinPoint joinPoint){
        System.err.println("End method name:" + joinPoint.getSignature().getName()
                + " Time: " + LocalDate.now());
    }
}
