package kr.co.ch03.sub2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 날짜 : 2023/01/03
 * 이름 : 황원진
 * 내용 : 스프링 AOP 실습하기
 * 
 */

public class AOPMain {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("application.xml");
		
		AOPService AOPservice = (AOPService)ctx.getBean("AOPService");
		
		
		System.out.println("--------------------------------");
		AOPservice.insert();
		
		System.out.println("--------------------------------");
		AOPservice.select();
		
		System.out.println("--------------------------------");
		AOPservice.update();
		
		System.out.println("--------------------------------");
		AOPservice.delete();
	}
}
