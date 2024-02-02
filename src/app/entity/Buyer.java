package app.entity;

public class Buyer {

    //створення змінних сутності Buyer :
    private final String name;
    private final String email;
    private final String phoneNumber;

    //створення конструктору :
    public Buyer(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //створення getter-ів :
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
