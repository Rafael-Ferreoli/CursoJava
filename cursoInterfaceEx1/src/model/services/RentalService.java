package model.services;

import model.entitites.CarRental;
import model.entitites.Invoice;

import java.time.Duration;

public class RentalService {
    private Double pricePerDay;
    private Double pricerPerHour;

    private TaxService taxService;

    public RentalService(Double pricePerDay, Double pricerPerHour, TaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricerPerHour = pricerPerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        double minutes = Duration.between(carRental.getStart(),carRental.getFinish()).toMinutes();
        double hours = minutes/60.0;
        double basicPayment;
        if (hours <= 12.0){
            basicPayment = pricerPerHour * Math.ceil(hours);
        }else{
            basicPayment = pricePerDay * Math.ceil(hours/24.0);
        }
        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment,tax));
    }
}
