package LLD.ATM_Machine.TransactionStratagy;

import LLD.ATM_Machine.Card;

public interface TransactionStrategy {
    void execute(Card card, double amount);
}
