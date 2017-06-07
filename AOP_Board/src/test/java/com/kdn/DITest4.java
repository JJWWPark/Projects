package com.kdn;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kdn.model.biz.BoardService;
import com.kdn.model.biz.BoardServiceImpl;
import com.kdn.model.biz.MemberService;
import com.kdn.model.biz.MemberServiceImpl;
import com.kdn.model.domain.Board;

public class DITest4 
{

	public static void main(String[] args) 
	{
		// aop에서는 interface로 수행
		BeanFactory container = new ClassPathXmlApplicationContext("com/kdn/config/beans_autowire.xml");
		BoardService boardService = container.getBean(BoardService.class);
		System.out.println(boardService.search(23));
		
		MemberService memberService = container.getBean(MemberService.class);
		System.out.println(memberService.search("kdn"));
		
	}
}
