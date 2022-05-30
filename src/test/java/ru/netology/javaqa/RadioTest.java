package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {
    @ParameterizedTest
    @CsvFileSource (resources = "/setStationTestData.csv")
    public void setStationTestData(int newStation, int expected){
        Radio radio = new Radio();
        radio.setCurrentStation(newStation);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource (resources = "/setVolumeTestData.csv")
    public void setVolumeTestData(int newVolume, int expected){
        Radio radio = new Radio();
        radio.setCurrentVolume(newVolume);
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource (resources = "/increaseVolumeTestData.csv")
    public void increaseVolumeTest(int currentVolume, int expected){
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource (resources = "/decreaseVolumeTestData.csv")
    public void decreaseVolumeTest(int currentVolume, int expected){
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource (resources = "/nextStationTestData.csv")
    public void nextStationTest(int currentStation, int expected){
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource (resources = "/prevStationTestData.csv")
    public void prevStationTest(int currentStation, int expected){
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}
