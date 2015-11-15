package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		String idBean = "helloWorld";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld helloWorld = (HelloWorld) applicationContext.getBean(idBean);
		helloWorld.getMessage();
		((AbstractApplicationContext)applicationContext).registerShutdownHook();
		((AbstractApplicationContext)applicationContext).close();
	}

}
