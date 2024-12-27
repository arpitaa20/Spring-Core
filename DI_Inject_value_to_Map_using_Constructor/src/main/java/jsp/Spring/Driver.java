package jsp.Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		BeanFactory fac = new ClassPathXmlApplicationContext("MyConfig.xml");
		Store s = fac.getBean("mystore" , Store.class);
		s.display();
	}

}
