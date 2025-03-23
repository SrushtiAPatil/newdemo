import java.util.Scanner;

class CountDigit {
    int getcount(int pin) {
        int count = 0;
        while (pin > 0) {
            count++;
            pin = pin / 10;
        }
        return count;
    }
}

class CheckPin {
    boolean verify(int pinNo) {
        return switch (pinNo) {
            case 1111, 2222, 3333 -> true;
            default -> false;
        };
    }
}

public class Bank {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        double balance = 40000;

        System.out.print("Enter pin number: ");
        int num = sc.nextInt();

        CountDigit digit = new CountDigit();
        int n = digit.getcount(num);

        if (n == 4) {
            CheckPin obj = new CheckPin();
            boolean k = obj.verify(num);  

            if (k) {
                int choice;
                do {
                    System.out.println("\nOptions:");
                    System.out.println("1. Withdrawal");
                    System.out.println("2. Deposit");
                    System.out.println("3. Check Balance");
                    System.out.println("4. Exit");
                    System.out.print("Enter your choice: ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.print("Enter withdrawal amount: ");
                            int withdrawal = sc.nextInt();
                            if (withdrawal > balance) {
                                System.out.println("Insufficient balance!");
                            } else {
                                balance -= withdrawal;
                                System.out.println("Withdrawal successful. Remaining Balance: " + balance);
                            }
                            break;

                        case 2:
                            System.out.print("Enter amount for deposit: ");
                            int deposit = sc.nextInt();
                            balance += deposit;
                            System.out.println("Deposit successful. Updated Balance: " + balance);
                            break;

                        case 3:
                            System.out.println("Total Available Balance: " + balance);
                            break;

                        case 4:
                            System.out.println("Exiting... Thank you!");
                            break;

                        default:
                            System.out.println("Invalid choice. Try again.");
                    }
                } while (choice != 4);
            } else {
                System.out.println("Invalid PIN.");
            }
        } else {
            System.out.println("PIN must be exactly 4 digits.");
        }
        sc.close();
    }
}
