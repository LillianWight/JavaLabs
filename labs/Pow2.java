public class Pow2 {
    public static void main(final String[] args) {
        int power = 1;

        for (int num = 1; num <= 16; num = num + 1) {
            System.out.print((num * 2) + "\t");
            power = power * 2;
            System.out.println(power); }
            System.out.println("\n");
    }
}