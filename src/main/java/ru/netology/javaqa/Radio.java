package ru.netology.javaqa;

public class Radio {
    private int currentVolume;
    private int currentStation;
    private int amountStations = 10;
    private int maxVolume = 100;

    public Radio(int amountStations) {
        this.amountStations = amountStations;
    }

    public Radio() {

    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        this.currentVolume = newVolume;
    }

    public void setCurrentStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > (amountStations - 1)) {
            return;
        }
        this.currentStation = newStation;
    }

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

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public int getCurrentStation() {
        return this.currentStation;
    }
}
