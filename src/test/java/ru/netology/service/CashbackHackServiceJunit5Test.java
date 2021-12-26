package ru.netology.service;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceJunit5Test {

    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldPurchaseAmountToTheBorder() {
        int expected = 500;
        int actual = cashbackHackService.remain(500);

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldPurchaseAmountMin() {
        int expected = 999;
        int actual = cashbackHackService.remain(1);

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldPurchaseAmountMax() {
        int expected = 1;
        int actual = cashbackHackService.remain(999);

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldPurchaseAmountAboveTheBorder() {
        int expected = 999;
        int actual = cashbackHackService.remain(1001);

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldPurchaseAmountNull() {
        int expected = 1000;
        int actual = cashbackHackService.remain(0);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldPurchaseAmountEqualToTheBorder() {
        int expected = 0;
        int actual = cashbackHackService.remain(1000);

        assertEquals(actual, expected);
    }
}
