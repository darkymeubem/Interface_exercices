package org.example.model.services;

import org.example.model.entitites.Invoice;

public class BrasilTaxServices implements TaxServices{
    public BrasilTaxServices(){
    }



    @Override
    public double tax(double amount) {
        if (amount <= 100) {
            return amount * 0.2;
        } else {
            return amount * 0.15;
        }
    }
}
