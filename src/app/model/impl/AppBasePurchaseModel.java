package app.model.impl;

import app.entity.Purchase;
import app.model.AppModel;

public class AppBasePurchaseModel implements AppModel {

    @Override
    public double calcPayment(Purchase purchase) {
        return purchase.getQuota() * purchase.getPrice();
    }
}
