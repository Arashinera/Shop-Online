package app.controller;

import app.entity.Buyer;
import app.entity.Purchase;
import app.entity.Product;
import app.model.impl.AppBasePurchaseModel;
import app.model.impl.AppDeliveryPurchaseModel;
import app.utils.Rounder;
import app.view.AppView;

public class AppController {

    private final AppView view = new AppView();
    private final static String CURRENCY = "EUR";

    public void getPayment() {
        String[] data = view.getData();
        Buyer client = getBuyer(data);
        Purchase purchase = getPurchase(data);
        Product productName = getProduct(data);
        String output;
        if (purchase.getChoice() == 1) {
            AppBasePurchaseModel model = new AppBasePurchaseModel();
            String paymentBase = Rounder.roundValue(model.calcPayment(purchase));
            output = "\nBuyer: " + client.getName() +
                    ", email: " + client.getEmail() +
                    ", phone number: " + client.getPhoneNumber() +
                    "\nProduct name: " + productName.getProductName() +
                    "\nPayment is " + CURRENCY + " " + paymentBase;
            view.getOutput(output);
        } else if (purchase.getChoice() == 2) {
            AppDeliveryPurchaseModel model = new AppDeliveryPurchaseModel();
            String paymentDelivery = Rounder.roundValue(model.calcPayment(purchase));
            output = "\nBuyer: " + client.getName() +
                    ", email: " + client.getEmail() +
                    ", phone number: " + client.getPhoneNumber() +
                    "\nPayment is " + CURRENCY + " " + paymentDelivery;
            view.getOutput(output);
        }
    }

    private Buyer getBuyer(String[] data) {
        return new Buyer(data[0], data[1], data[2]);
    }

    private Product getProduct(String[] data) {
        return new Product(data[3]);
    }

    private Purchase getPurchase(String[] data) {
        return new Purchase(Integer.parseInt(data[4]),
                Double.parseDouble(data[5]),
                Integer.parseInt(data[6])
        );
    }
}
