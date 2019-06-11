import aop.with.different.pointcuts.Operation;
import com.spring.boot.model.CustomerBo;
import com.spring.boot.service.CustomerBoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBootApplicationTest {

    public static void main(String[] args) throws Exception {

        // One way of using AOP
       /* ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Customer.xml");

        CustomerBo customer = (CustomerBo) appContext.getBean("customer");

        customer.addCustomer();
        customer.addCustomerReturnValue();
        customer.addCustomerThrowException();*/

       //Another way of using AOP
        ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Customer.xml");
        Operation operation = (Operation)appContext.getBean("operation");
       /* operation.k();
        operation.m();*/
        //operation.msg();
        try {
            System.out.println("calling validate...");
            operation.validate(15);
        }catch (Exception e)
        {
            System.out.println(e);
        }

        try {
            System.out.println("calling validate again...");
            operation.validate(19);
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
