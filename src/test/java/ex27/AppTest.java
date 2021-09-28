/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Faiz Ahmed
 */

package ex27;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;

import static ex27.App.*;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    @DisplayName("Checking if first name is true")
    public void firstname() {

        Assertions.assertEquals(true, App.validatefname("John"));
    }

    @Test
    @DisplayName("Checking if first name is false")
    public void firstname1() {

        Assertions.assertEquals(false, App.validatefname("J"));
    }

    @Test
    @DisplayName("Checking if last name is true")
    public void lastname() {

        Assertions.assertEquals(true, App.validatelname("Ahmed"));
    }

    @Test
    @DisplayName("Checking if last name is false")
    public void lastname1() {

        Assertions.assertEquals(false, App.validatelname(""));
    }

    @Test
    @DisplayName("Checking if id is true")
    public void id() {

        Assertions.assertEquals(true, App.validateid("TK-4321"));
    }

    @Test
    @DisplayName("Checking if id is false")
    public void id1() {

        Assertions.assertEquals(false, App.validateid("A12-1234"));
    }

    @Test
    @DisplayName("Checking if zip code is true")
    public void zip() {

        Assertions.assertEquals(true, App.validatezip("55555"));
    }

    @Test
    @DisplayName("Checking if last name is false")
    public void zip1() {

        Assertions.assertEquals(false, App.validatezip("ABCDE"));
    }

}
