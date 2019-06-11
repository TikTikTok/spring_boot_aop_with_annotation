package aop.with.different.pointcuts;

public class OperationImpl implements Operation {

    public void msg() {
        System.out.println("msg method invoked");
    }

    public int m() {
        System.out.println("m method invoked");
        return 2;
    }

    public int k() {
        System.out.println("k method invoked");
        return 3;
    }

    public void validate(int age) throws ArithmeticException
    {
        if(age < 18)
        {
            throw new ArithmeticException(" Age is below 18 : Not valid ");
        }else {
            System.out.println(" Congratulations: You can proceed next step ");
        }
    }
}
