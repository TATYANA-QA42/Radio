package ru.netology.radio;
public class Radio {
    private int radioStation;
    private int currentVolume;

// public int diapazonRadio(){
// if (radioStation<=0 || radioStation <=9){
// radioStation=radioStation;
// }
// return 0;

    public int minVolume() {
        currentVolume = 0;
        return currentVolume;
    }

    public int maxVolume() {
        currentVolume = 10;
        return currentVolume;
    }
    public int minRadioStation() {
        radioStation = 0;
        return radioStation;
    }

    public int maxRadioStation() {
        radioStation = 9;
        return radioStation;
    }


    public void increaseVolume() {
        setCurrentVolume(currentVolume + 1);
    }

    public void decreaseVolume() {
        setCurrentVolume(currentVolume-1);
    }
    public void nextRadioStation() {

        if (radioStation>=9){
            setRadioStation(minRadioStation());
        }
        else {
            setRadioStation(radioStation+1);
        }
    }
    public void prevRadioStation() {
        if (radioStation <= 0 ){
            setRadioStation(9);
        }
        else {
            setRadioStation(radioStation-1);
        }
    }
    public void setCurrentVolume(int currentVolume){
        if (currentVolume<0) {
            minVolume();
            return;
        }if (currentVolume>=10){
            this.currentVolume=maxVolume();
        }
        else{
            this.currentVolume=currentVolume;
        }
    }
    public int getRadioStation() {

        return radioStation;
    }

    public void setRadioStation(int radioStation) {
        if (radioStation <= 0) {
            maxRadioStation();
        }
        if (radioStation >= 9) {
            minRadioStation();
        }
        this.radioStation=radioStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
}