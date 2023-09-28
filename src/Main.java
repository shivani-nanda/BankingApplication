import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! What is your name?");
        String name = scanner.nextLine();
        BankAccount bankAccount = new BankAccount(name);

        System.out.println("Hello " + bankAccount.getName() + ". What would you like to do today? Withdraw, Deposit, Check, or Exit?");
        String userSelectedOption = null;

        do {
            userSelectedOption = scanner.next();
            if (userSelectedOption.equalsIgnoreCase("Withdraw")) {
                System.out.println("How much would you like to withdraw?");
                int withdrawAmount = scanner.nextInt();
                bankAccount.withdraw(withdrawAmount);
            }
            else if (userSelectedOption.equalsIgnoreCase("Deposit")) {
                System.out.println("How much would you like to deposit?");
                int depositAmount = scanner.nextInt();
                bankAccount.deposit(depositAmount);
            }
            else if (userSelectedOption.equalsIgnoreCase("Check")) {
                bankAccount.checkBalance();

            }
            else if(userSelectedOption.equalsIgnoreCase("exit")){
                System.out.println("Good Bye!");
                break;
            }
            else {
                System.out.println("Wrong userSelectedOption");
            }

            System.out.println("Choose another userSelectedOption");
        } while(!userSelectedOption.equalsIgnoreCase("exit"));

    }

}