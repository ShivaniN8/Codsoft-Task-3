package AtmInterface;

public class BankAccount {

        private double balance;

        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public boolean withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Insufficient funds. Withdrawal failed.");
                return false;
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
                return true;
            }
        }

}

