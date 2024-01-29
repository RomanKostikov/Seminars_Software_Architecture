package Models;

/**
 * Модель перевозчика
 */
public class Carrier {
    private int id;
    private int zones; // ???
    private long cardNumber;

    public Carrier(int id, long cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
    }

    public int getId() {
        return id;
    }

    public long getCardNumber() {
        return cardNumber;
    }
}
