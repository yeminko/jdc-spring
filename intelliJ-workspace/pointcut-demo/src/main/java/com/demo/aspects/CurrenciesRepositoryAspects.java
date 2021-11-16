package com.demo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CurrenciesRepositoryAspects {

    @Before("this(com.demo.bls.CurrenciesRepositoryImpl)")
    public void beforeThisCurrenciesRepository(JoinPoint joinPoint) {
        System.out.println("Before - this(CurrenciesRepositoryImpl) is invoked ::" + joinPoint.getSignature());
    }

    @Before("target(com.demo.bls.CurrenciesRepositoryImpl)")
    public void beforeTargetCurrenciesRepository(JoinPoint joinPoint) {
        System.out.println("Before - target(CurrenciesRepositoryImpl) is invoked ::" + joinPoint.getSignature());
    }
}
