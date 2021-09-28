/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Faiz Ahmed
 */

package ex24;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    @DisplayName("Checking if two words are anagrams.")
    public void isAnagramTrue() {

        Assertions.assertEquals(true, App.isAnagram("tone", "note"));
        Assertions.assertEquals(true, App.isAnagram("thing", "night"));

    }

    @Test
    @DisplayName("Checking if two words are not anagrams.")
    public void isAnagramFalse() {

        Assertions.assertEquals(false, App.isAnagram("night", "note"));
        Assertions.assertEquals(false, App.isAnagram("tone", "thing"));

    }
}
