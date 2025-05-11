package LLD.ATM_Machine.TransactionStratagy;

import LLD.ATM_Machine.Account;
import LLD.ATM_Machine.Card;
import LLD.ATM_Machine.Service.NotificationService;

public class DepositStrategy implements TransactionStrategy {

    @Override
    public void execute(Card card, double amount) {
        Account account = card.getAccount();

        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }

        double updatedBalance = account.getBalance() + amount;
        account.setBalance(updatedBalance);

        System.out.println("Deposit of ₹" + amount + " successful.");
        System.out.println("Updated Balance: ₹" + updatedBalance);

        // Optional: Save transaction to DB, notify user
        NotificationService notifier = new NotificationService();
        notifier.notifyUser(card, "₹" + amount + " deposited successfully.");
    }
}

