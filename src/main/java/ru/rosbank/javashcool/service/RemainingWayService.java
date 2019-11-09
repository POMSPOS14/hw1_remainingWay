package ru.rosbank.javashcool.service;

public class RemainingWayService {

    public int calculate(int consumption, int fuel) {
        int consumptionInML = consumption * 1000;
        int fuelInML = fuel * 1000;

        int approximateWay = fuelInML / (consumptionInML / 100);

        return approximateWay;
    }

}
