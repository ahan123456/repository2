package cn.itcast;

import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Date;

public class Aspect {
    /**
     * 前置增强
     */
    public void before(){
        System.out.println ("前置增强....");
        System.out.println (new Date () );
    }

    /**
     * 后置增强
     */
    public void afterReturning(){
        System.out.println ("后置增强....");
        System.out.println (new Date ());
    }

    /**
     * 环绕增强
     * @param pjp
     * @return
     * @throws Throwable
     */
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println ("前置增强....");
        Object proceed = pjp.proceed ();
        System.out.println ("后置增强....");
        return proceed;
    }

    /**
     * 异常抛出增强
     */
    public void throwing(){
        System.out.println ("异常抛出增强....");
    }

    /**
     * 最终增强
     */
    public void after(){
        System.out.println ("最终增强...");
    }

}
