import java.util.Scanner;

class banking_system {
    private static final String accno = "AA9876543";

    void registration() {
        String name;
        String area;
        int mobile_number = 0;
        int minBalance=0;

        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the name:");
            name = s.next().trim();
            if (name.length() == 0) {
                System.out.println("Enter a valid name");
                return;
            } else {
                System.out.println(name);
            }

            System.out.println("Enter your Area:");
            area = s.next();

            System.out.println("Enter your mobile number:");
            try {
                mobile_number = s.nextInt();
                if (mobile_number < 0) {
                    System.out.println("You entered an invalid number ");
                    return;
                } else {
                    System.out.println("You entered a valid number " + mobile_number);
                }
            } catch (Exception e) {
                s.nextLine();
                System.out.println("Enter a valid number.");
                mobile_number = s.nextInt();
            }

            System.out.println("Enter your choice:");
            System.out.println("1. Saving\n2. Current");

            int n = s.nextInt();
            System.out.println("You entered " + n);

            switch (n) {
                case 1:
                    System.out.println("You have selected a savings account");
                    break;
                case 2:
                    System.out.println("You have selected a current account");
                    System.out.println("Enter your minimum balance ");
                    minBalance = s.nextInt();
                    System.out.println("Your minimum balance is " + minBalance);
                    System.out.println("PAYMENT SUCCESSFUL");
                    System.out.println("Your account number is " + accno);
                    break;
                default:
                    System.out.println("Invalid choice, please select again!");
                    return;
            }

            int balance = 0;

            do {
                System.out.print("\n1. Deposit ");
                System.out.print("\n2. Withdraw ");
                System.out.print("\n3. Transaction ");
                System.out.print("\n4. Mini Statement ");
                System.out.print("\n5. Exit ");
               

                switch (n) {
                    case 1:
                        System.out.println("Deposit");
                        System.out.println("Enter the amount to deposit ");
                        int depositAmount = s.nextInt();
                        balance += depositAmount;
                        break;

                    case 2:
                        System.out.println("Withdrawal");
                        System.out.println("Enter the amount to withdrawal");
                        int request = s.nextInt();

                        if (request > balance) {
                            System.out.println("Insufficient Funds! Current balance: " + balance);
                        } else {
                            balance -= request;
                        }
                        break;

                    case 3:
                        System.out.println("Transaction");
                        break;

                    case 4:
                        System.out.println("Mini Statement");
                        System.out.println("Name: " + name);
                        System.out.println("Area: " + area);
                        System.out.println("Account Number: " + accno);
                        System.out.println("Mobile Number: " + mobile_number);
                        System.out.println("Your total Balance: " + balance);
                        System.out.println("Your total MINBalance: " + minBalance);
                        break;

                    case 5:
                        System.out.println("Exit");
                        break;

                    default:
                        System.out.println("Invalid choice, please select again!");
                        break;
                }
            } while (n != 5);
            
        }
    }

    public static void main(String[] args) {
        banking_system obj = new banking_system();
        obj.registration();
    }
}
