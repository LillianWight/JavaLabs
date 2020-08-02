public class PowTable {
    public static void main(String[] args) {
        
        System.out.println("");

        for (int num = 1; num <= 10; num++) {
            int result = 1; 
            for (int power = 1; power <= 8; power++) {
                result = result * num;
                System.out.print(result + "\t");
            }
            System.out.println("");
        }
    }
}
