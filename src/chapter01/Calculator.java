package chapter01;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hello God of Java !!!!!");
        System.out.println("I love this book.");
    }
    //빼기 메소드 만들기
    public int subtract(int num1, int num2) {
        int subtract;
        subtract = num1 - num2;
        return subtract;
    }
    //곱하기 메소드 만들기
    public int multiply(int num1, int num2) {
        int multiply;
        multiply = num1 * num2;
        return multiply;
    }
    //나누기 메소드 만들기
    public int divide(int num1, int num2) {
        int divide;
        divide = num1 / num2;
        return divide;
    }
}