public class RunningSumAvg {
    public static void main(final String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        float num = 0.0F;
        float sum = 0.0F;
        float avg = 0.0F;
        float count = 0.0F;
        
        System.out.println();
        System.out.println("\t\t\t\t" + "Count\tEntered\tSum\tAverage");
                
        while (true) {
            System.out.print("Please enter a number: ");
            num = scanner.nextFloat();

            if(num == 0) {
                break;
            }
            
            sum = sum + num;
            count = count + 1;
            avg = sum / count;
            
            System.out.println("\t\t\t\t" + count + "\t" + num + "\t" + sum + "\t" + avg);
            
        }    
        scanner.close();
    }
}
