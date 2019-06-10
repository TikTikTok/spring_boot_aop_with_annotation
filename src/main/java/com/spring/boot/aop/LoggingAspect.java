package com.spring.boot.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.spring.boot.service.CustomerBoImpl.addCustomer(..))")
    public void logBefore(JoinPoint joinPoint)
    {
        System.out.println( " log before addcustomer() is running ");
        System.out.println(" hijacked : "+ joinPoint.getSignature().getName());
        System.out.println(" ****************************  ");
    }

    @After("execution(* com.spring.boot.service.CustomerBoImpl.addCustomer(..))")
    public void logAfter(JoinPoint joinPoint)
    {
        System.out.println( " log after addcustomer() is running ");
        System.out.println(" hijacked : "+ joinPoint.getSignature().getName());
        System.out.println(" ****************************  ");
    }

    @AfterReturning("execution(* com.spring.boot.service.CustomerBoImpl.addCustomerReturnValue(..))")
    public void afterReturning(JoinPoint joinPoint)
    {
        System.out.println(" After returning ");
        System.out.println(" hijacked "+joinPoint.getSignature().getName());
        System.out.println(" ************************* ");
    }

    @AfterThrowing("execution(* com.spring.boot.service.CustomerBoImpl.addCustomerThrowException(..))")
    public void afterThrowing(JoinPoint joinPoint)
    {
        System.out.println(" while throwing ");
        System.out.println(" hijacked "+joinPoint.getSignature().getName());
        System.out.println(" *********************** ");
    }
}
