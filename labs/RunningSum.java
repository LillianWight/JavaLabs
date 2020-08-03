public class RunningSum {
    public static void main(final String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        float num1, num2 = 0.0F;
        
        System.out.println();
        System.out.println("\t\t\t\t\t" + "Entered\tSum");
                
        while (true) {
            System.out.print("Please enter a number: ");
            num1 = scanner.nextFloat();

            if(num1 == 0) {
                break;
            }

            num2 = num2 + num1;

            
            System.out.println("\t\t\t\t\t" + num1 + "\t" + num2);
        }    
        scanner.close();
    }
}
