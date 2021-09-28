/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Faiz Ahmed
 */

package ex26;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    @DisplayName("Checking if month to pay off credit card is correct.")
    public void payoff() {

        Assertions.assertEquals(70, App.calculateMonthsUntilPaidOff((12/100.0), 5000.00,100.0));
    }

    @Test
    @DisplayName("Checking if month to pay off credit card is correct.")
    public void payoff1() {

        Assertions.assertEquals(38, App.calculateMonthsUntilPaidOff((27/100.0),10000.00,400.0));
    }

}
