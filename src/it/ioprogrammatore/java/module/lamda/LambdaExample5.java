package it.ioprogrammatore.java.module.lamda;

@FunctionalInterface
interface StringProcessor {
    String process(String str);
}

public class LambdaExample5 {

    public static void main(String[] args) {
        // Using lambda expression to implement process method to convert string to uppercase
        StringProcessor toUpperCase = str -> str.toUpperCase();

        // Invoke the lambda expression
        String result = toUpperCase.process("hello, lambda!");
        System.out.println("Processed string: " + result);
    }
}