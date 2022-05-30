package ru.netology.javaqa;

public class Radio {
    private int currentVolume;
    private int currentStation;

    public void setCurrentVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            return;
        }
        this.currentVolume = newVolume;
    }

    public void setCurrentStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > 9) {
            return;
        }
        this.currentStation = newStation;
    }

    public void increaseVolume(int currentVolume) {
        int newVolume = 0;
        if (currentVolume == 10) {
            newVolume = 10;
        }
        if (currentVolume < 10) {
            newVolume = currentVolume + 1;
        }
        setCurrentVolume(newVolume);
    }

    public void decreaseVolume(int currentVolume) {
        int newVolume = 0;
        if (currentVolume == 0) {
            newVolume = 0;
        }
        if (currentVolume > 0) {
            newVolume = currentVolume - 1;
        }
        if (currentVolume > 10) {  //этот код на случай если текущая громкость каким то образом окажется 11, тогда сеттер ее пропустит
            return;
        }
        setCurrentVolume(newVolume);
    }

    public void nextStation(int currentStation) {
        int newStation = 0;
        if (currentStation == 9) {
            newStation = 0;
        }
        if (currentStation < 9) {
            newStation = currentStation + 1;
        }
        setCurrentStation(newStation);
    }

    public void prevStation(int currentStation) {
        int newStation = 0;
        if (currentStation == 0) {
            newStation = 9;
        }
        if (currentStation > 0) {
            newStation = currentStation - 1;
        }
        if (currentStation > 9) {     //этот код на случай если текущая станция каким то образом будет равна 10, тогда сеттер ее пропустит
            return;
        }
        setCurrentStation(newStation);
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }
}
