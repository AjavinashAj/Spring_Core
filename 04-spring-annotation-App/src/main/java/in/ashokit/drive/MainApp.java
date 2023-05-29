package in.ashokit.drive;
import in.ashokit.bean.*;
import in.ashokit.config.AppConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
	//ApplicationContext ac=new ClaaPathXmlApplicationContext("bean.xml");
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
	}

}
