public class MultTable5 {
    public static void main(String[] args) {
        int num = 0;
        int factor = 0;

        for (num = -5; num <= 5; num++) {
            for (factor = 1; factor <= 10; factor++) {
                System.out.print((num * factor) + "\t");
            }
            System.out.println("");
        }
    }
}
