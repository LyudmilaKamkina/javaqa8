package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/fullRadio100TestData.csv")
    public void fullRadioTest(int currentStation, int currentVolume, int expectedCurrentStation, int expectedCurrentVolume, int expectedIncVolume, int expectedDecVolume, int expectedNextStation, int expectedPrevStation) {
        Radio radio1 = new Radio(currentVolume, currentStation, 100, 100);
        radio1.setCurrentStation(currentStation);
        radio1.setCurrentVolume(currentVolume);

        Assertions.assertEquals(expectedCurrentStation, radio1.getCurrentStation());
        Assertions.assertEquals(expectedCurrentVolume, radio1.getCurrentVolume());

        radio1.prevStation();
        Assertions.assertEquals(expectedPrevStation, radio1.getCurrentStation());

        radio1.setCurrentStation(currentStation);
        radio1.nextStation();
        Assertions.assertEquals(expectedNextStation, radio1.getCurrentStation());

        radio1.increaseVolume();
        Assertions.assertEquals(expectedIncVolume, radio1.getCurrentVolume());

        radio1.setCurrentVolume(currentVolume);
        radio1.decreaseVolume();
        Assertions.assertEquals(expectedDecVolume, radio1.getCurrentVolume());
    }

}
