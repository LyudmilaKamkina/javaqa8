package ru.netology.javaqa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Radio {
    private int currentVolume;
    private int currentStation;
    private int amountStations = 10;
    private int maxVolume = 100;

    public void increaseVolume() {
        int newVolume = 0;
        if (currentVolume == maxVolume) {
            newVolume = maxVolume;
        }
        if (currentVolume < maxVolume) {
            newVolume = currentVolume + 1;
        }
        setCurrentVolume(newVolume);
    }

    public void decreaseVolume() {
        int newVolume = 0;
        if (currentVolume == 0) {
            newVolume = 0;
        }
        if (currentVolume > 0) {
            newVolume = currentVolume - 1;
        }
        setCurrentVolume(newVolume);
    }

    public void nextStation() {
        int newStation = 0;
        if (currentStation == (amountStations - 1)) {
            newStation = 0;
        }
        if (currentStation < (amountStations - 1)) {
            newStation = currentStation + 1;
        }
        setCurrentStation(newStation);
    }

    public void prevStation() {
        int newStation = 0;
        if (currentStation == 0) {
            newStation = (amountStations - 1);
        }
        if (currentStation > 0) {
            newStation = currentStation - 1;
        }
        setCurrentStation(newStation);
    }
}
