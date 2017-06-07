package com.kdn.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class TimeCal 
{
	public Object time(ProceedingJoinPoint jp)
	{
		long start = System.currentTimeMillis();
		
		try 
		{
			return jp.proceed(); 		// 핵심 모듈 수행
			
		} 
		
		catch (Throwable e) 
		{
			
		}
		
		finally
		{
			long end = System.currentTimeMillis();
			System.out.println("============= 수행시간계산 =============");
			System.out.println("메소드 이름 : ");
			System.out.println(jp.getSignature());
			System.out.println("수행 시간");
			System.out.print(end-start);
			System.out.println("ms");
		}
		
		return null;
	}

}
