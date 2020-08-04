
public class RunningStats {
    public static void main(final String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        float num = 0.0F;
        float sum = 0.0F;
        float avg = 0.0F;
        float count = 0.0F;
        float largest = 0.0F;
        float smallest = 0.0F;
        
        System.out.println();
        System.out.println("\t\t\t\t" + "Entered\tSum\tAverage\tLargest\tSmallest");
                
        while (true) {
            System.out.print("Please enter a number: ");
            num = scanner.nextFloat();
            
            if(num == 0) {
                break;
            }

            if(count == 0) {
                smallest = num;
                largest = num;
            }
            else {
                if(num < smallest) {
                smallest = num;
                }
                if(num > largest) {
                    largest = num;
                }
            }

            sum = sum + num;
            count = count + 1;
            avg = sum / count;
            
            System.out.println("\t\t\t\t" + num + "\t" + sum + "\t" + avg + "\t" + largest + "\t" + smallest);
            
        }    
        scanner.close();
    }
}
