package ru.rosbank.javashcool.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemainingWayServiceTest {

    @Test
    void calculateRemainingWay() {
        RemainingWayService service = new RemainingWayService();
        int consumption = 12;
        int fuel = 30;

        int result = service.calculate(consumption, fuel);

        assertEquals(result, 250);
    }

    @Test
    void calculateRemainingWayIfNoFuel() {
        RemainingWayService service = new RemainingWayService();
        int consumption = 20;
        int fuel = 0;

        int result = service.calculate(consumption, fuel);

        assertEquals(result, 0);
    }
}