package aop.with.different.pointcuts;

public interface Operation {
    void msg();

    int m();

    int k();

    void validate(int age) throws ArithmeticException;
}
