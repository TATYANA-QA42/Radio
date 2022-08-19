package ru.netology.radio;

public class Radio {
    private int radioStation;
    private int currentVolume;
    private int numberRadioStations;
    private int minRadioStation = 0;
    private int maxRadioStation;


    public Radio() {
        this.numberRadioStations = 10;
        this.maxRadioStation = numberRadioStations - 1;
    }

    public Radio(int numberRadioStations) {
        this.numberRadioStations = numberRadioStations;
        this.maxRadioStation = numberRadioStations - 1;
    }

    public int minVolume() {
        currentVolume = 0;
        return currentVolume;
    }

    public int maxVolume() {
        currentVolume = 100;
        return currentVolume;
    }

    public void increaseVolume() {
        setCurrentVolume(currentVolume + 1);
    }

    public void decreaseVolume() {
        setCurrentVolume(currentVolume - 1);
    }

    public void nextRadioStation() {

        if (radioStation >= maxRadioStation) {
            setRadioStation(minRadioStation);
        } else {
            setRadioStation(radioStation + 1);
        }
    }

    public void prevRadioStation() {
        if (radioStation <= minRadioStation) {
            setRadioStation(maxRadioStation);
        } else {
            setRadioStation(radioStation - 1);
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            minVolume();
            return;
        }
        if (currentVolume >= 100) {
            this.currentVolume = maxVolume();
        } else {
            this.currentVolume = currentVolume;
        }
    }

    public int getRadioStation() {

        return radioStation;
    }

    public void setRadioStation(int radioStation) {
        if (radioStation < minRadioStation) {
            setRadioStation(maxRadioStation);
        }
        if (radioStation > maxRadioStation) {
            setRadioStation(minRadioStation);
        }
        this.radioStation = radioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}


