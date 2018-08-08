package com.kurvasoft.advices;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
    @Before("execution(* com.kurvasoft.service.*.*(..))")
    public void logBefore() {
        System.out.println("@Before proxies :: " + LocalDateTime.now());
    }

    @After("execution(* com.kurvasoft.service.*.*(..))")
    public void logAfter() {
        System.out.println("@After proxies :: " + LocalDateTime.now());
    }
}
