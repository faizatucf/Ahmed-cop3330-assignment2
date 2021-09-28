/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Faiz Ahmed
 */

package ex25;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    @DisplayName("Checking for a very weak password.")
    public void is_pass_very_weak() {

        Assertions.assertEquals(0, App.passwordValidator("12345"));
    }

    @Test
    @DisplayName("Checking for a weak password.")
    public void is_pass_weak() {

        Assertions.assertEquals(1, App.passwordValidator("abcdef"));
    }

    @Test
    @DisplayName("Checking for a strong password.")
    public void strong() {

        Assertions.assertEquals(2, App.passwordValidator("abc123xyz"));
    }

    @Test
    @DisplayName("Checking for a very strong password.")
    public void is_pass_very_strong() {

        Assertions.assertEquals(3, App.passwordValidator("1337h@xor!"));
    }
}
