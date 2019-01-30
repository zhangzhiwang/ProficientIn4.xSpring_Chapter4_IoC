package com.asiainfo.beanFactoryAndAppContext;

import java.io.IOException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * 测试BeanFactory
 *
 * @author zhangzhiwang
 * @date 2019年1月27日 下午6:59:55
 */
public class BeanFactoryTest {
	public static void main(String[] args) throws IOException {
//		ResourceLoader resourceLoader = new PathMatchingResourcePatternResolver();
//		Resource resource = resourceLoader.getResource("classpath:spring_zzw.xml");
//
//		System.out.println(resource.getURL());
//		
//		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//		BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
//		beanDefinitionReader.loadBeanDefinitions(resource);//BeanDefinitionReader通过Resource的形式家在配置文件中的bean定义。此时BeanFactory初始化完成，但并不会实例化bean
//		
//		Car car = beanFactory.getBean("car", Car.class);//bean在第一次使用的时候被初始化
//		System.out.println(car);
//		
//		System.out.println("---------------------------");
		
		// 使用ClassPathXmlApplicationContext从classpath加载配置文件
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_zzw.xml");//相当于classpath:spring_zzw.xml,ApplicationContext和BeanFactory不同的是：ApplicationContext初始化的时候就将bean初始化，而不是在用的时候才初始化
//		Car car2 = applicationContext.getBean("car", Car.class);
//		System.out.println(car2);
		
		//使用AnnotationConfigApplicationContext来加载用类注解的方式配置的bean
		ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(ABean.class);
		Car car2 = applicationContext2.getBean("car2", Car.class);
		System.out.println(car2);
	}
}
