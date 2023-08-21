package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//public class TestRadio {
//    @Test
//    public void NextCurrentChannelTest() {
//        Radio radio = new Radio();
//        radio.setCurrentStation(9);
//
//        radio.next();
//
//        int expected = 0;
//        int actual = radio.getCurrentStation();
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void NextCurrentChannelTest1() {
//        Radio radio = new Radio();
//        radio.setCurrentStation(0);
//
//        radio.next();
//
//        int expected = 1;
//        int actual = radio.getCurrentStation();
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void SetNewMaxChannelTestWrong() {
//        Radio radio = new Radio();
//        radio.setCurrentStation(11);
//
//        int expected = 0;
//        int actual = radio.getCurrentStation();
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void SetNewMinChannelTestWrong() {
//        Radio radio = new Radio();
//        radio.setCurrentStation(-1);
//
//        int expected = 0;
//        int actual = radio.getCurrentStation();
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void PrevChannelTest() {
//        Radio radio = new Radio();
//        radio.setCurrentStation(9);
//
//        radio.prev();
//
//        int expected = 8;
//        int actual = radio.getCurrentStation();
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void PrevAfterMinChannelTest() {
//        Radio radio = new Radio();
//        radio.setCurrentStation(0);
//
//        radio.prev();
//
//        int expected = 9;
//        int actual = radio.getCurrentStation();
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void IncreaseVolumeTest() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(33);
//
//        radio.nextVolume();
//
//        int expected = 34;
//        int actual = radio.getCurrentVolume();
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void IncreaseVolumeTest1() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(99);
//
//        radio.nextVolume();
//
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void IncreaseOverMaxVolumeTest() {
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(101);
//
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void IncreaseOverMinVolumeTest() {
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(-1);
//
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void DecreaseVolumeTest() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(5);
//
//        radio.prevVolume();
//
//        int expected = 4;
//        int actual = radio.getCurrentVolume();
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void LowAfterMinVolumeTest() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(1);
//
//        radio.prevVolume();
//
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void PrevAfterMinVolumeTest() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(0);
//
//        radio.prevVolume();
//
//        int expected = 99;
//        int actual = radio.getCurrentVolume();
//        Assertions.assertEquals(expected, actual);
//    }
//}
public class TestRadio{

    Radio radio = new Radio();

    @Test
    public void totalStation() {
        Radio radio1 = new Radio(10);
        Assertions.assertEquals(10,radio1.getMaxQuantityRadioStation());

    }
    @Test
    public void maxEndMinStation() {
        Radio radio1 = new Radio();
        radio.getMaxNumberStation();
        radio1.getMinNumberStation();
        Assertions.assertEquals(9,radio1.getMaxNumberStation());
        Assertions.assertEquals(0,radio1.getMinNumberStation());
            }
}
