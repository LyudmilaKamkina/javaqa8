package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {
    Radio radio = new Radio();

    @ParameterizedTest
    @CsvFileSource(resources = "/setStationTestData.csv")
    public void setStationTestData(int amountStations, int newStation, int expectedRad0, int expectedRad1) {
        Radio radio1 = new Radio(amountStations);

        radio.setCurrentStation(newStation);
        radio1.setCurrentStation(newStation);

        Assertions.assertEquals(expectedRad0, radio.getCurrentStation());
        Assertions.assertEquals(expectedRad1, radio1.getCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/setVolumeTestData.csv")
    public void setVolumeTestData(int newVolume, int expected) {
        radio.setCurrentVolume(newVolume);
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/increaseVolumeTestData.csv")
    public void increaseVolumeTest(int currentVolume, int expected) {
        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume();

        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/decreaseVolumeTestData.csv")
    public void decreaseVolumeTest(int currentVolume, int expected) {
        radio.setCurrentVolume(currentVolume);
        radio.decreaseVolume();

        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/nextStationTestData.csv")
    public void nextStationTest(int amountStations, int currentStation, int expectedRad0, int expectedRad1) {
        Radio radio1 = new Radio(amountStations);

        radio.setCurrentStation(currentStation);
        radio1.setCurrentStation(currentStation);

        radio.nextStation();
        radio1.nextStation();

        Assertions.assertEquals(expectedRad0, radio.getCurrentStation());
        Assertions.assertEquals(expectedRad1, radio1.getCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/prevStationTestData.csv")
    public void prevStationTest(int amountStations, int currentStation, int expectedRad0, int expectedRad1) {
        Radio radio1 = new Radio(amountStations);

        radio.setCurrentStation(currentStation);
        radio1.setCurrentStation(currentStation);

        radio.prevStation();
        radio1.prevStation();

        Assertions.assertEquals(expectedRad0, radio.getCurrentStation());
        Assertions.assertEquals(expectedRad1, radio1.getCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/fullRadio100TestData.csv")
    public void fullRadioTest(int currentStation, int currentVolume, int expectedCurrentStation, int expectedCurrentVolume, int expectedIncVolume, int expectedDecVolume, int expectedNextStation, int expectedPrevStation) {
        Radio radio1 = new Radio(100);
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
