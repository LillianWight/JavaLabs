public class Factorial {
    public static void main(String[] args) {
        int num = 1;
        for(int factor = 1; factor <= 12; factor++) {
            num = factor * num;
            System.out.println(factor + "!" + "  " + "=" + "  " + num);
        }
    }
    
}