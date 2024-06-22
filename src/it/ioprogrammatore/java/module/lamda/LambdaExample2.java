package it.ioprogrammatore.java.module.lamda;


@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaExample2 {

    public static void main(String[] args) {
        // Using lambda expression to implement operate method for addition
        MathOperation addition = (a, b) -> a + b;

        // Invoke the lambda expression
        int result = addition.operate(5, 3);
        System.out.println("Result of addition: " + result);
    }
}
