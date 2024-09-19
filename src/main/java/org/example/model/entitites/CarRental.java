package org.example.model.entitites;

import java.time.LocalDateTime;

public class CarRental {


    private LocalDateTime start;
    private LocalDateTime finish;
    private Vehicle vehicle;
    private Invoice invoice;

    public CarRental() {

    }



    public Invoice getInvoice() {
        return invoice;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;

    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDateTime getStart() {
        return start;
    }


    public LocalDateTime getFinish() {
        return finish;
    }


}
