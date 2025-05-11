package LLD.ATM_Machine.states;

import LLD.ATM_Machine.ATM;
import LLD.ATM_Machine.Card;

public interface ATMState {
    void insertCard(ATM atm, Card card);
    void enterPin(ATM atm, String pin);
    void selectOperation(ATM atm, String operationType);
    void performTransaction(ATM atm, double amount);
    void ejectCard(ATM atm);
}
