package LLD.ATM_Machine.Service;

import LLD.ATM_Machine.Card;

public class NotificationService {
    public void notifyUser(Card card, String message) {
        System.out.println("Notification to " + card.getCardNumber() + ": " + message);
    }
}

