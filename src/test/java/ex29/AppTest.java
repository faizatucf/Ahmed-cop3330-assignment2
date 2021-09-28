/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Faiz Ahmed
 */

package ex29;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    @DisplayName("Checking the the rule of 72.")

    public void ruleof72() {
        Assertions.assertEquals(18, App.rule72(4));
    }
    public void ruleof72test2() {
        Assertions.assertEquals(1, App.rule72(50));
    }
}
