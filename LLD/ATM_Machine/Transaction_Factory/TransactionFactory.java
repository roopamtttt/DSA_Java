package LLD.ATM_Machine.Transaction_Factory;

import LLD.ATM_Machine.TransactionStratagy.CheckBalanceStrategy;
import LLD.ATM_Machine.TransactionStratagy.DepositStrategy;
import LLD.ATM_Machine.TransactionStratagy.TransactionStrategy;
import LLD.ATM_Machine.TransactionStratagy.WithdrawStrategy;

public class TransactionFactory {
    public static TransactionStrategy getStrategy(String type) {
        switch(type) {
            case "WITHDRAW": return new WithdrawStrategy();
            case "DEPOSIT": return new DepositStrategy();
            case "BALANCE": return new CheckBalanceStrategy();
            default: throw new IllegalArgumentException("Invalid type");
        }
    }
}

