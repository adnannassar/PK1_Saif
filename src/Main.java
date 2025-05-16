package src;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("add: " + calculator.add(10, 2));
        System.out.println("sub: " + calculator.sub(10, 2));
        System.out.println("mult: " + calculator.mult(10, 2));
        System.out.println("div: " + calculator.div(10, 2));
        System.out.println("mod: " + calculator.mod(10, 2));
    }
}
