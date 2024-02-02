package app.entity;

public class Purchase {

    //створення змінних сутності Purchase :
    private final int quota;
    private final double price;
    private final int choice;

    //створення конструктору :
    public Purchase(int quota, double price, int choice) {
        this.quota = quota;
        this.price = price;
        this.choice = choice;
    }

    //створення getter-ів :
    public int getQuota() {
        return quota;
    }

    public double getPrice() {
        return price;
    }

    public int getChoice() {
        return choice;
    }
}
