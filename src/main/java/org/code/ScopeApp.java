package org.code;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Database database1 = context.getBean("database",Database.class);
		Database database2 = context.getBean("database",Database.class);
		if(database1 == database2) {
			System.out.println("Ambas variables de referencia apuntan al mismo objeto");
		} else {
			System.out.println("Las variables de referencia apuntan al diferentes objetos");
		}
		User user1 = context.getBean("user",User.class);
		User user2 = context.getBean("user",User.class);
		if(user1 == user2) {
			System.out.println("Ambas variables de referencia apuntan al mismo objeto");
		} else {
			System.out.println("Las variables de referencia apuntan al diferentes objetos");
		}
		context.close();
	}

}
