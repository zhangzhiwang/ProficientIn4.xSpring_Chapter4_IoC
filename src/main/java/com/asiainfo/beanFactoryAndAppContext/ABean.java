package com.asiainfo.beanFactoryAndAppContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 标名一个bean配置的提供类，表示该类提供bean的定义。注：该类提供的bean配置，bean的class属性可以不是该类，相见本类的getNewCar方法
@Configuration
public class ABean {
	private String brand;
	private String color;
	private int maxSpeed;

	public ABean() {
		super();
	}

	public ABean(String brand, String color, int maxSpeed) {
		super();
		this.brand = brand;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}

	// 定义一个bean
	// 相当于 <bean id="car2" class="com.asiainfo.beanFactoryAndAppContext.Car" p:brand="Audi" p:color="white" p:maxSpeed="100"/>
	@Bean(name="car2")
	public Car getNewCar() {
		Car car2 = new Car();
		car2.setBrand("Audi");
		car2.setColor("white");
		car2.setMaxSpeed(100);
		return car2;
	}

}
