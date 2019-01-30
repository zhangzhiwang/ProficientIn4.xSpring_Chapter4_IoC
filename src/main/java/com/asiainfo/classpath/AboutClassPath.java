package com.asiainfo.classpath;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 有关classpath:和classpath*:的测试
 *
 * @author zhangzhiwang
 * @date 2019年1月25日 下午8:57:42  
 */
public class AboutClassPath {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/smart-context.xml");
		System.out.println(applicationContext.getClassLoader().getResource("").getPath());
	}
}
