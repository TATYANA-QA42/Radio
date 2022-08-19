package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio(10);

    @Test
    public void turnUpVolumeOne() {
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void turnUpVolumeOne2() {
        radio.setCurrentVolume(110);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void turnDownVolumeOne() {
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void changeOverLastRadioStation() {
        radio.setRadioStation(10);
        radio.nextRadioStation();
        ;
        assertEquals(0, radio.getRadioStation());
    }

    @Test
    public void plusVolume() {
        radio.setCurrentVolume(110);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void prevRadioStation() {
        radio.setRadioStation(5);
        radio.prevRadioStation();
        assertEquals(4, radio.getRadioStation());
    }

    @Test
    public void nextRadioStation2() {
        radio.setRadioStation(5);
        radio.nextRadioStation();
        assertEquals(6, radio.getRadioStation());
    }

    @Test
    public void prevMinRadioStation() {
        radio.setRadioStation(0);
        radio.prevRadioStation();
        assertEquals(9, radio.getRadioStation());
    }

    @Test
    public void MinRadioStation() {
        radio.setRadioStation(-1);
        radio.prevRadioStation();
        assertEquals(9, radio.getRadioStation());
    }

    @Test
    public void turnMinDownVolumeOne() {
        radio.setCurrentVolume(-2);
        assertEquals(0, radio.getCurrentVolume());
    }

    Radio radio2 = new Radio();

    @Test
    public void changeOverLastRadioStation2() {
        radio2.setRadioStation(10);
        radio2.nextRadioStation();
        ;
        assertEquals(0, radio2.getRadioStation());
    }

    @Test
    public void plusVolume2() {
        radio2.setCurrentVolume(110);
        radio2.increaseVolume();
        assertEquals(100, radio2.getCurrentVolume());
    }

    @Test
    public void prevRadioStation2() {
        radio2.setRadioStation(5);
        radio2.prevRadioStation();
        assertEquals(4, radio2.getRadioStation());
    }

    @Test
    public void nextRadioStation4() {
        radio.setRadioStation(5);
        radio.nextRadioStation();
        assertEquals(6, radio.getRadioStation());
    }

    @Test
    public void prevMinRadioStation2() {
        radio2.setRadioStation(0);
        radio2.prevRadioStation();
        assertEquals(9, radio2.getRadioStation());
    }

    @Test
    public void MinRadioStation2() {
        radio2.setRadioStation(-1);
        radio2.prevRadioStation();
        assertEquals(9, radio2.getRadioStation());
    }
}


