package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		System.out.println("hello coder");
		//start IOC container
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		 Employee emp=context.getBean(Employee.class);
		 System.out.println(emp.toString());
		 Student stu=context.getBean(Student.class);
		 System.out.println(stu.getSid()+"\n"+stu.getSname()+"\n"+stu.getMarks()+"\n"+stu.rank());

	}

}
