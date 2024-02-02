package app.view;

import java.util.Scanner;
import java.util.Locale;

public class AppView {

    private final Scanner input = new Scanner(System.in);

    public String[] getData() {
        input.useLocale(Locale.ENGLISH);
        System.out.println("NAVI TECHNO SHOP :" +
                "\nPlease, enter buyer name :");
        String name = input.nextLine().trim();
        System.out.println("Please, enter buyer email :");
        String email = input.nextLine().trim();
        System.out.println("Please, enter buyer phone number :");
        String phoneNumber = input.nextLine().trim();
        System.out.println("Please, enter product name :");
        String productName = input.nextLine().trim();
        System.out.println("Please, enter product quantity :");
        String quantity = input.nextLine().trim();
        System.out.println("Please, enter product price per item, EUR :");
        String price = input.nextLine().trim();
        System.out.println("""
                Please, enter delivery method :
                1) Pickup from Office
                2) To Home Delivery""");
        String choice = input.nextLine().trim();
        input.close();
        return new String[]{name, email, phoneNumber, productName, quantity, price, choice};
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
