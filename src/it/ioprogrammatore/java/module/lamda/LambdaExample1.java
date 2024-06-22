package it.ioprogrammatore.java.module.lamda;


@FunctionalInterface
interface Greeting {
    void sayHello();
}

public class LambdaExample1 {

    public static void main(String[] args) {
        // Using lambda expression to implement sayHello method
        Greeting greeting = () -> System.out.println("Hello, Lambda!");

        // Invoke the lambda expression
        greeting.sayHello();
    }
}
