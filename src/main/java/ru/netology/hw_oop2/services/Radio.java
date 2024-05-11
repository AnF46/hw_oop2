package ru.netology.hw_oop2.services;

public class Radio {
    //stations
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        int newsStation = currentStation + 1;
        if (currentStation < 9) {
            setCurrentStation(newsStation);
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        int prevStation = currentStation - 1;
        if (currentStation > 0) {
            setCurrentStation(prevStation);
        } else {
            currentStation = 9;
        }
    }

    //volume
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        int moreVolume = currentVolume + 1;
        if (currentVolume < 100) {
            setCurrentVolume(moreVolume);
        } else {
            getCurrentVolume();
        }
    }

    public void decreaseVolume() {
        int lessVolume = currentVolume - 1;
        if (currentVolume > 0) {
            setCurrentVolume(lessVolume);
        } else {
            getCurrentVolume();
        }
    }
}
