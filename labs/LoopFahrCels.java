
public class LoopFahrCels {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int temp = 0;
		char scale = 'A';
        
        // get user input five times, display output each time

        for (int num = 1; num <= 5; num++) {
            System.out.print("Please enter the temperature: ");
            temp = scanner.nextInt();
		    System.out.print("Please enter \"F\" for Fahrenheit, \"C\" for Celsius: ");
            scale = scanner.next().charAt(0);
            if (scale == 'F' || scale == 'f') {
                temp = (temp - 32) * 5 / 9;
                System.out.println("The temperature in degrees Celsius is " + temp); }
            else {
                temp = (temp * 9 / 5) + 32;
                System.out.println("The temperature in degrees Fahrenheit is " + temp); }
        }
        scanner.close();
  }
}
