/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Faiz Ahmed
 */

package ex33;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    @DisplayName("Checking if we are generating 0, 1, Or 2.")

    public void magictest() {
        //output is RANDOM. VALUED returned can be 0, 1 OR 2.
        Assertions.assertEquals(0, App.magic("Will I get full points for this?"));
    }
}
