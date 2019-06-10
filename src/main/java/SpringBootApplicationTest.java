import com.spring.boot.model.CustomerBo;
import com.spring.boot.service.CustomerBoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBootApplicationTest {

    public static void main(String[] args) throws Exception {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Customer.xml");

        CustomerBo customer = (CustomerBo) appContext.getBean("customer");

        customer.addCustomer();
        customer.addCustomerReturnValue();
        customer.addCustomerThrowException();
    }
}
