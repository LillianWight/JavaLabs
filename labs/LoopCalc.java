public class LoopCalc {
    public static void main(final String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double num1, num2, result = 0;
        char operator = 'A';
        
        while (true) {
            System.out.print("Please enter a number (enter 0 to Quit): ");
            num1 = scanner.nextDouble();
            System.out.print("Please enter an operator: ");
            operator = scanner.next().charAt(0);
            System.out.print("Please enter another number (enter 0 to Quit): ");
            num2 = scanner.nextDouble();
                
            if(num1 == 0 && num2 == 0) {
                break; }
            // Determine operator, perform calculation, display output
            
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("The result of " + num1 + " + " + num2 + " is " + result);
                    break;
                case '-':
                result = num1 - num2;
                System.out.println("The result of " + num1 + " - " + num2 + " is " + result);
                    break;
                case '*':
                result = num1 * num2;
                System.out.println("The result of " + num1 + " * " + num2 + " is " + result);
                    break;
                case '/':
                result = num1 / num2;
                System.out.println("The result of " + num1 + " / " + num2 + " is " + result);
                    break;
            }
        }
            
            scanner.close();
    }
}
