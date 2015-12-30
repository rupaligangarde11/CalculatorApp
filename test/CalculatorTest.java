import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @org.junit.Test
    public void shouldAdd5() {
        String input = "add 5";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        calculator.run(scanner);
        assertEquals("5.0", calculator.toString());
    }

    @Test
    public void shouldAddTwoAndFive() {
        String input = "add 2\nadd 5";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        calculator.run(scanner);
        assertEquals("7.0",calculator.toString());
    }

    @Test
    public void shouldAddTwoAndFiveAndSubtractThree() {
        String input = "add 2\nadd 5\nsubtract 3";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        calculator.run(scanner);
        assertEquals("4.0",calculator.toString());
    }

    @Test
    public void shouldAddTwoAndFiveThenSubtractThreeAndMultiplyByFive() {
        String input = "add 2\nadd 5\nsubtract 3\nmultiply 5";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        calculator.run(scanner);
        assertEquals("20.0",calculator.toString());
    }

    @Test
    public void shouldAddTwoAndMultiplyByFiveAndDivideByTwo() {
        String input = "add 2\nmultiply 5\ndivide 2";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        calculator.run(scanner);
        assertEquals("5.0", calculator.toString());
    }

    @Test
    public void shouldAddTwoAndMultiplyByFiveAndDivideByTwoThenCancel() {
        String input = "add 2\nmultiply 5\ndivide 2\ncancel";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        calculator.run(scanner);
        assertEquals("0.0", calculator.toString());
    }


}
