import com.spring.boot.service.CustomerBoImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class SpringBootAppApplication {

	public static void main(String[] args) throws Exception {
		//SpringApplication.run(SpringBootAppApplication.class, args);

		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Customer.xml");

		CustomerBo customer = (CustomerBo) appContext.getBean("customer");

		CustomerBoImpl customerBo = new CustomerBoImpl();
		customerBo.addCustomer();

	}

}
