package com.kurvasoft.advices;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.ProceedingJoinPoint;


@Component
@Aspect
public class LogAspect {
    /**
     *   @Pointcut(" execution(* com.concretepage.service.*.*(..))") advices untuk semua package
     *   @Pointcut(" execution (* com.concretepage.bean.UserService.doTask(..))") untuk method
     *   @Pointcut(" execution(* com.concretepage.bean.UserService+.*(..))") untuk semua method di dalam class
     *
     * */

   /**
    *   Log Proxy for transaction based on annotations : @Transactions
    */
   
   
   //@Before("@annotation(com.kurvasoft.annotations.Transactions)")
   //public void logBeforeAccountTransaction() {
   //    System.out.println("@Proxy Transaction Started : " + LocalDateTime.now());
   //}
    
   @Pointcut("@annotation(com.kurvasoft.annotations.Transactions)")
   public void accountTransactions() {
       //Empty implementation,starts using advice only
   }

   @Around("accountTransactions()")
   public void logRunningAccountTransaction(ProceedingJoinPoint projoinpoint) throws Throwable{
       System.out.println("@Proxy Transaction before Record with method -  " + projoinpoint.getSignature().getName() + " : " + LocalDateTime.now());
       
       try {
           projoinpoint.proceed();
       } finally {
           
       }
       System.out.println("@Proxy Transaction after Record with method -  " + projoinpoint.getSignature().getName() + " : " + LocalDateTime.now());
   }
    
   
   //@After("@annotation(com.kurvasoft.annotations.Transactions)")
   //public void logAfterAccountTransaction() {
   //    System.out.println("@Proxy Transaction Ended : " + LocalDateTime.now());
   //}
   

   /**
    * Log Proxy for account activity
    */
   
   @Before("execution (* com.kurvasoft.service.*.*(..))")
   public void logBeforeActivity(JoinPoint joinpoint) {
       System.out.println("@Before Proxy Activity : " + LocalDateTime.now() + " with method : " + joinpoint.getSignature().getName());
   }
   
   //@Around("execution (* com.kurvasoft.service.*.*(..))")
   //public void logCurrentActivity(ProceedingJoinPoint projoinpoint) {
   //    System.out.println("@Current Proxy Activity : " + LocalDateTime.now() + " with method : " + joinpoint.getSignature().getName());
   //}
   
   @After("execution (* com.kurvasoft.service.*.*(..))")
   public void logAfterActivity() {
       System.out.println("@After Proxy Activity : " + LocalDateTime.now());
   }
   
   
   /**
    * Goes for successfull method without throwing exception
    * @param joinpoint
    */
   
   @AfterReturning("execution (* com.kurvasoft.service.CustomerService+.*(..))")
   public void logSuccessReturn(JoinPoint joinpoint) {
       System.out.println("@Success Proxy : " + joinpoint.getSignature() + "\n");
   }  
}