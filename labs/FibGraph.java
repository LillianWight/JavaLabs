public class FibGraph {
   public static void main(String[] args) {
        int f0 = 0, f1 = 1, sum = 1;
        System.out.println(); // prints a clean line for spacing purposes
        System.out.println(""); // prints the value of Fib0 in stars i.e. zero stars
        System.out.println('*'); // prints the value of Fib1 in stars i.e. one star
        for (int num = 2; num < 20; num++) { // starting at Fib2 and continuing to Fib10, adding one value per iteration
            sum = f0 + f1; // teach the program how to Fibonacci
            f0 = f1;
            f1 = sum;
            for(int star = 0; star < sum; star++) { // starting at zero stars and continuing for as long as the number of stars is less than the Fibonacci sum, adding one star per iteration
                System.out.print('*'); /* print a star on the same line; the first time, we print 0 + one star, then we move to the next iteration because printing a second star would make star > sum, so the next star is printed on the next line - giving us one star - then another star is printed there because star is still < sum, but printing a third star would mean star > sum, so the next star is printed on the next line, and so on. */
            }
            System.out.println();
       }
       
   } 
}