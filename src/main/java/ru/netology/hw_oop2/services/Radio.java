package ru.netology.hw_oop2.services;

public class Radio {
    //stations

    private int numberOfStations;
    private final int DEFAULT_NUMBER_OF_STATIONS = 10;
    private int currentStation;
    private final int minStation = 0;
    private int maxStation;
    private int currentVolume;
    private int maxVolume;
    private int minVolume;

    public Radio(int numberOfStations) {

        this.numberOfStations = numberOfStations;
    }

    public Radio() {

    }

    public Radio(int maxVolume, int minVolume) {
        this.maxVolume = 100;
        this.minVolume = 0;
    }
    

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

    //VOLUME
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    //STATION METHODS
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

    //volume METHODS

    public void increaseVolume() {
        int moreVolume = currentVolume + 1;
        if (currentVolume > minVolume) {
            setCurrentVolume(moreVolume);
        } else if (currentVolume >= maxVolume) {
            moreVolume = maxVolume;
        } else if (currentVolume <= minVolume) {
            moreVolume = minVolume;
        }
    }

    public void decreaseVolume() {
        int lessVolume = currentVolume - 1;
        if (currentVolume < maxVolume) {
            setCurrentVolume(lessVolume);
        } else if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
    }
}