package app.model.impl;

import app.entity.Purchase;
import app.model.AppModel;

public class AppDeliveryPurchaseModel implements AppModel {

    double[] deliveryRates = {3, 5, 10};

    @Override
    public double calcPayment(Purchase purchase) {
        double sum = purchase.getPrice() * purchase.getQuota();
        if (sum <= 200) {
            return sum + sum * deliveryRates[2] / 100;
        } else if (sum > 200 && sum <= 1000) {
            return sum + sum * deliveryRates[1] / 100;
        } else {
            return sum + sum * deliveryRates[0] / 100;
        }
    }
}
