package org.example.model.services;

import org.example.model.entitites.CarRental;
import org.example.model.entitites.Invoice;

import java.time.Duration;

public class RentalServices {
    private Double precoPorHora;
    private Double precoPorDia;
    TaxServices taxServices;

    public RentalServices(Double precoPorHora, Double precoPorDia, TaxServices taxServices) {
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
        this.taxServices = taxServices;
    }



    public void processInvoice(CarRental carRental) {
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;
        double basicPayment;

        if (hours <= 12) {
            basicPayment = precoPorHora * Math.ceil(hours);

        } else {
            basicPayment = precoPorDia * Math.ceil(hours / 24);
        }
        double tax = taxServices.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));


    }


}
