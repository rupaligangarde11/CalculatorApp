import java.util.Scanner;
import java.util.StringTokenizer;

public class Calculator {

    private double currentValue;

    private void performOperation(String operation, double operator){
        switch (operation) {
            case "add" : currentValue += operator;
                break;
            case "subtract" : currentValue -= operator;
                break;
            case "multiply" : currentValue *= operator;
                break;
            case "divide" : currentValue /= operator;
                break;

        }
    }

    private void processInput(String inputCommand) {
        if (inputCommand.equalsIgnoreCase("cancel")) {
            currentValue = 0;
        } else {
            StringTokenizer stringTokenizer = new StringTokenizer(inputCommand);
            String operation = stringTokenizer.nextToken();
            Double operator = Double.parseDouble(stringTokenizer.nextToken());
            performOperation(operation, operator);
        }
    }

    @Override
    public String toString() {
        return String.valueOf(currentValue);
    }


    public void run(Scanner scanner) {
        while (scanner.hasNext()){
            String input = scanner.nextLine();
            if(input.equals("exit")) {
                break;
            } else {
                processInput(input);
            }
            System.out.println(currentValue);
        }
    }
}


