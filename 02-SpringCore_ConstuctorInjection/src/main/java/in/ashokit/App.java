package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		//IOC start
    ApplicationContext ac=new ClassPathXmlApplicationContext("Bean.xml");		
    System.out.println("Application Execution finished...");
    Car car=ac.getBean(Car.class);
    car.drive();
	}

}
