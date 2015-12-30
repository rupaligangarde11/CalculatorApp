import java.util.Scanner;

public class CalculatorAppDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        calculator.run(scanner);
    }
}
