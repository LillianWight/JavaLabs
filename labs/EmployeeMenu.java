public class EmployeeMenu {
	public static void main(final String[] args) {
		final java.util.Scanner scanner = new java.util.Scanner(System.in);
		//declare and initialize variable
		int option = 0;
        //start loop, display menu
        while (true) {
            System.out.println("\n");
            System.out.println("   Employee File");
            System.out.println("   -------------");
            System.out.println("Option\tDescription");
            System.out.println("------\t-----------");
            System.out.println("0     \tExit       ");
            System.out.println("1     \tEnter a new employee");
            System.out.println("2     \tView an existing employee");
            System.out.println("3     \tDelete an employee");
            System.out.println("4     \tList all employees");
            System.out.println();

            //prompt user
            System.out.print("Please choose an option: ");

            //get user's option
            option = scanner.nextInt();

            if (option == 0) {
                System.out.println("\nYou chose to Exit");
                break;
            }

            else 
                if (option == 1) {
                    System.out.println("\nYou chose to Enter a new employee");
                }
            else
                if (option == 2) {
                    System.out.println("\nYou chose to View an existing employee");
                }
            else
                if (option == 3) {
                    System.out.println("\nYou chose to Delete an employee");
                }
            else
                if (option == 4) {
                    System.out.println("\nYou chose to List all employees");
                }
            else {
                System.out.println("\nYou chose an invalid option.");
            }
        }
        scanner.close();
	}
}