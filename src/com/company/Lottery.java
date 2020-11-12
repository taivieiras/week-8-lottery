//I will change variables and make turn this code into the lottery
//Eg. CarPark --> Lottery  Vehicle --> Tickets...
package com.company;

import java.util.ArrayList;

public class Lottery {

// Altering the code from the car park example to have a base.

    private ArrayList<Ticket> lotteryNumbers = new ArrayList<Ticket>();

// Print Lottery tickets
    public Lottery() {
        MessageCentre.DebugMessage("Printing your Ticket");
    }

    public void ParkVehicle(Vehicle vehicleToPark) {
        listOfCars.add(vehicleToPark);
    }

    public Double CalculateDailyRevenue() {
        Double charge = 5.00;
        Double totalRevenue = 0.0;

        for(Vehicle currentCar:listOfCars) {
            MessageCentre.DebugMessage(String.format("Calculating for %s : %s",currentCar.getManufacturer(), currentCar.getModelName()));
            totalRevenue += charge;

        }

        return totalRevenue;
    }

    @Override
    public String toString() {

        return String.format("The car park has %d cars and daily revenue of %f", listOfCars.size(), CalculateDailyRevenue());
    }
}