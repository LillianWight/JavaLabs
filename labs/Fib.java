public class Fib {
   public static void main(String[] args) {
        int f0 = 0, f1 = 1, sum = 1;
        System.out.println();
        System.out.print(f0 + "  " + f1 + "  ");
        for (int num = 1; num <= 18; num++) {
            System.out.print((f0 + f1 + "  "));
            sum = f0 + f1;
            f0 = f1;
            f1 = sum;
       }
       System.out.println("\n");
   } 
}