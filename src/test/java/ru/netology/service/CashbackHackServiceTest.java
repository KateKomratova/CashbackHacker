package ru.netology.service;


import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldPurchaseAmountToTheBorder() {
        int expected = 500;
        int actual = cashbackHackService.remain(500);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldPurchaseAmountMin() {
        int expected = 999;
        int actual = cashbackHackService.remain(1);

        assertEquals(expected,actual);
    }

    @Test
    public void shouldPurchaseAmountMax() {
        int expected = 1;
        int actual = cashbackHackService.remain(999);

        assertEquals(expected,actual);
    }

    @Test
    public void shouldPurchaseAmountAboveTheBorder() {
        int expected = 999;
        int actual = cashbackHackService.remain(1001);

        assertEquals(expected,actual);
    }

    @Test
    public void shouldPurchaseAmountNull() {
        int expected = 1000;
        int actual = cashbackHackService.remain(0);

        assertEquals(expected,actual);
    }

    @Test
    public void shouldPurchaseAmountEqualToTheBorder() {
        int expected = 0;
        int actual = cashbackHackService.remain(1000);

        assertEquals(expected,actual);
    }
    
}