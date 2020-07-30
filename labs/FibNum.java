public class FibNum {
   public static void main(String[] args) {
        int f0 = 0, f1 = 1, sum = 1;
        System.out.println();
        System.out.println(f0 + "\t" + f0 + "\n" + f1 + "\t" + f1);
        for (int num = 2; num < 20; num++) {
            System.out.println(num + "\t" + (f0 + f1));
            sum = f0 + f1;
            f0 = f1;
            f1 = sum;
       }
       System.out.println("\n");
   } 
}