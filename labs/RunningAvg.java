
public class RunningAvg {
    public static void main(final String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        float num = 0.0F;
        float sum = 0.0F;
        float avg = 0.0F;
        float average = 0.0F;
        float count = 0.0F;
        float largest = 0.0F;
        float smallest = 0.0F;
        
        System.out.println();
        System.out.println("\t\t\t\t" + "Count\tEntered\tSum\tAvg\tAverage\tLrg\tSml");
                
        while (true) {
            System.out.print("Please enter a number: ");
            num = scanner.nextFloat();
            count = count + 1;
            
            if(num == 0) {
                break;
            }

            if(count == 1) {
                average = num;
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
                average = (average) + ((num - average) / count);
            }

            sum = sum + num;
            avg = sum / count;
            
            System.out.println("\t\t\t\t" + count + "\t" + num + "\t" + sum + "\t" + avg + "\t" + average + "\t" + largest + "\t" + smallest);
            
        }    
        scanner.close();
    }
}
