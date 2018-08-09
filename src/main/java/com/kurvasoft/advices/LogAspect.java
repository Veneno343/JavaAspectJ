package com.kurvasoft.advices;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;

@Component
@Aspect
public class LogAspect {
    /**
     *   @Pointcut(" execution(* com.concretepage.service.*.*(..))") advices untuk semua package
     *   @Pointcut(" execution (* com.concretepage.bean.UserService.doTask(..))") untuk method
     *   @Pointcut(" execution(* com.concretepage.bean.UserService+.*(..))") untuk semua method di dalam class
     *
     * */

    // TODO buat point cut @Before @after
    @Before("execution(* com.kurvasoft.service.CustomerService.add(..))")
    public void logAddBefore() {
        System.out.println("@Before proxies :: " + LocalDateTime.now());
    }
    
    @Before("execution(* com.kurvasoft.service.CustomerService+.*(..))")
    public void logJointBefore(JoinPoint joinp) {
        System.out.println("@Proxy Before JoinPoint :: " + joinp.getSignature().getName());
    }
    
    @After("execution(* com.kurvasoft.service.CustomerService.add(..))")
    public void logJointAfter(JoinPoint joinp) {
        System.out.println("@Proxy After JoinPoint :: " + joinp.getArgs().toString());
    }

    @After("execution(* com.kurvasoft.service.CustomerService.add(..))")
    public void logAddAfter() {
        System.out.println("@After proxies :: " + LocalDateTime.now() + "\n");
    }
    
    @Before("execution(* com.kurvasoft.service.CustomerService.setName(..))")
    public void logSetNameAfter() {
        System.out.println("@Before Proxy - SetName :: " + LocalDateTime.now());
    }
    
    @AfterReturning("execution(* com.kurvasoft.service.CustomerService+.*(..))")
    public void logReturn() {
        System.out.println("@AfterReturn Proxy - All Method :: " + LocalDateTime.now() + " \n");
    }
    
    /**
    @Around("execution(* com.kurvasoft.service.CustomerService.setName(..))")
    public void logSetNameAround() {
        System.out.println("@Around Proxy - SetName :: " + LocalDateTime.now());
    }
    **/
}
