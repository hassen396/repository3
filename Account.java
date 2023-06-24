import java.util.Scanner;

class checker {
    void check(double Amount) {
        if (Amount <= 0) {
            System.out.println("invalid Amount!");
            System.out.println("please enter amount that is grtaer than 0");

        }
    }
}

class Account {
    public static void menu() {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Select an option:");
        System.out.println("1. Withdraw Amount");
        System.out.println("2. Deposit Amount");
        System.out.println("3. Balance");
        System.out.println("4. Exit");
        System.out.println("--------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        checker check = new checker();
        System.out.println("Wellcome!");
        Scanner sc = new Scanner(System.in);
        double balance;
        double Amount;
        do {
            System.out.print("Enter your balance(must be greater than or equal to 0) : ");
            balance = sc.nextDouble();
        } while (balance < 0);

        boolean escape = true;
        while (escape) {

            menu();
            int selector = sc.nextInt();
            switch (selector) {
                case 1:
                    System.out.println("How much amount you want to withdraw from your account?");
                    System.out.print("Amount : ");

                    Amount = sc.nextDouble();
                    if (Amount < balance && Amount > 0) {
                        balance -= Amount;
                        System.out.println();
                        System.out.println("your new balance is: " + balance);
                        break;
                    } else if (Amount <= 0) {
                        check.check(Amount);
                        break;

                    }

                    else {
                        System.out.println("your balance is not sufficit to withdram " + Amount
                                + " now you can withdraw lessthan or equal to yur balance, deposit or exit!");
                        break;
                    }
                case 2:
                    System.out.println("How much amount you want to deposit to your account?");

                    Amount = sc.nextDouble();
                    if (Amount < 0) {
                        check.check(Amount);
                        break;
                    }

                    else {
                        balance += Amount;

                        System.out.println();
                        System.out.println("your new balance is: " + balance);
                        break;
                    }

                case 3: {
                    System.out.println("your balance is : " + balance);
                    break;
                }
                case 4:
                    escape = false;
                    break;

            }

        }

    }
}

n
