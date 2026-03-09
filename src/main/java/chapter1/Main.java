package main.java.chapter1;

public class Main {

public static void main (String[] args) {
    System.out.print("Bad code result : ");
    new O().p(2, 5);
    System.out.println("Clean code result : "+new OrderCalculator().calculateTotal(2, 5));

    }
}
