package ru.netology.hw_oop2.services;

public class Radio {
    //stations

    //private final int defaultNumbersOfStations = 10;
    private int numberOfStations;
    private int currentStation;
    private final int minStation = 0;
    private int maxStation;
    private int currentVolume;
    private int maxVolume;
    private int minVolume;

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public Radio(int maxVolume, int minVolume) {
        this.maxVolume = 100;
        this.minVolume = 0;
    }

    /*public Radio() {
        this.defaultNumbersOfStations = defaultNumberOfStations;
    }*/

    public int getNumberOfStations() {
        return numberOfStations;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        maxStation = numberOfStations - 1;
        return maxStation;
    }

    public int getMinStation() {
        return minStation;

    }


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > getMaxStation()) {
            return;
        }
        if (newCurrentStation < getMinStation()) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        int newsStation = currentStation + 1;
        if (currentStation < maxStation) {
            setCurrentStation(newsStation);
        } else if (currentStation == maxStation) {
            currentStation = minStation;
        }
    }

    public void prevStation() {
        int prevStation = currentStation - 1;
        if (currentStation > minStation) {
            setCurrentStation(prevStation);
        } else if (currentStation == minStation) {
            currentStation = maxStation;
        }
    }

    //volume

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < maxVolume) {
            currentVolume = newCurrentVolume;
        } else if (newCurrentVolume >= maxVolume) {
            newCurrentVolume = maxVolume;
        }
        if (newCurrentVolume > minVolume) {
            currentVolume = newCurrentVolume;
        } else if (newCurrentVolume <= minVolume) {
            newCurrentVolume = minVolume;
        }
    }

    public void increaseVolume() {
        int moreVolume = currentVolume + 1;
        if (currentVolume < maxVolume) {
            setCurrentVolume(moreVolume);
        }
    }

    public void decreaseVolume() {
        int lessVolume = currentVolume - 1;
        if (currentVolume < maxVolume) {
            setCurrentVolume(lessVolume);
        } else {
            currentVolume = minVolume;
        }
    }
}