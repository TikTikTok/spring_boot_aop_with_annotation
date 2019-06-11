package aop.with.different.pointcuts;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class TrackOperationAspect {

    @Pointcut("execution(* aop.with.different.pointcuts.Operation.*(..))")
    public void m() {
    }// Point cut name


    @Pointcut("execution(* aop.with.different.pointcuts.Operation.*(..))")
    public void k() {
    }// Point cut name


    // @AfterReturning doesn't need point cut, we can directly mention at advice method
    // below throws compile time error
   /* @Pointcut(value = "execution(* aop.with.different.pointcuts.Operation.*(..))", returning = "result")
    public void l() {
    }// Point cut name
   */

    @Pointcut("execution(* aop.with.different.pointcuts.Operation.*(..))")
    public void aroundPointCut() {

    }

    // AfterThrowing doesn't need point cut, we can directly mention at advice method itself
   /* @Pointcut(value = "execution(* aop.with.different.pointcuts.Operation.*(..))", throwing = "error")
    public void afterThrowing()
    {

    }
*/

    @Before("m()")//pointcut on before advice
    public void beforeAdvice(JoinPoint joinPoint)// this is adivce
    {
        System.out.println(" Additional Task : Before ");
    }

    @After("k()")//pointcut on before advice
    public void afterAdvice(JoinPoint joinPoint)// this is adivce
    {
        System.out.println(" Additional Task : After ");
    }

    @AfterReturning(value = "execution(* aop.with.different.pointcuts.Operation.*(..))", returning = "result")
    public void afterReturningAdvice(JoinPoint joinPoint, Object result) {
        System.out.println(" After returning advice ");
    }

    @Around("aroundPointCut()")
    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println(" Around Advice : 1 ");
        Object o = proceedingJoinPoint.proceed(); // *****  calling proceed method from ProceedingJoitPoint is mandatory ****  +++++
        System.out.println(" Around Advice : 2 ");
        return;
    }

    @AfterThrowing(value = "execution(* aop.with.different.pointcuts.Operation.msg(..))", throwing = "error")
    public void afterThrowing(JoinPoint joinPoint,Throwable error)
    {
        System.out.println(" Before throwing error message ");
        System.out.println(" signature "+joinPoint.getSignature());
        System.out.println(" Error : "+error.getMessage());
        System.out.println(" After throwing error message ");
    }


}
