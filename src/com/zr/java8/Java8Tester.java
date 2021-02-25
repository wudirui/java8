package com.zr.java8;

/**
 * java8新特性
 */
public class Java8Tester {

    public static void main(String[] args) {
        Java8Tester java8Tester = new Java8Tester();
        //类型声明
        MathOperation addition = (int a, int b) -> a + b;

        //不用类型声明
        MathOperation subtraction = (a, b) -> a - b;

        //大括号中的返回语句
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };
        //没有大括号及其返回语句
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10+5=" + java8Tester.operate(10, 5, addition));
        System.out.println("10-5=" + java8Tester.operate(10, 5, subtraction));
        System.out.println("10*5=" + java8Tester.operate(10, 5, multiplication));
        System.out.println("10/5=" + java8Tester.operate(10, 5, division));


    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        int sayMessage(String msg);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
