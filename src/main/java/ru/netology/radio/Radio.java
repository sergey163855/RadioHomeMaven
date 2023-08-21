package ru.netology.radio;

//public class Radio {
//    private int currentStation;
//    private int currentVolume;

//       public void next() {
//      if (currentStation != 9) {
//            currentStation++;
//        } else {
//            currentStation = 0;
//        }
//    }
//
//    public void prev() {
//        if (currentStation != 0) {
//            currentStation--;
//        } else {
//            currentStation = 9;
//        }
//    }
//
//    public void nextVolume() {
//        if (currentVolume != 99) {
//            currentVolume++;
//        } else {
//            currentVolume = 0;
//        }
//    }
//
//    public void prevVolume() {
//        if (currentVolume != 0) {
//            currentVolume--;
//        } else {
//            currentVolume = 99;
//        }
//    }
//
//    public int getCurrentStation() {
//        return currentStation;
//    }
//
//    public void setCurrentStation(int currentStation) {
//        if (currentStation < 0) {
//            return;
//        }
//        if (currentStation > 9) {
//            return;
//        }
//        this.currentStation = currentStation;
//    }
//
//    public int getCurrentVolume() {
//        return currentVolume;
//    }
//
//    public void setCurrentVolume(int currentVolume) {
//        if (currentVolume < 0) {
//            return;
//        }
//        if (currentVolume > 100) {
//            return;
//        }
//        this.currentVolume = currentVolume;
//    }
//}
public class Radio {
    private int maxQuantityRadioStation = 10;
    private int maxNumberStation = 9;
    private int minNumberStation = 0;
    private int currentRadioStation;
    private int maxSound = 100;
    private int minSound = 0;
    private int soundVolume;

    public Radio(int maxQuantityRadioStation) {
        this.maxQuantityRadioStation = maxQuantityRadioStation;
        this.maxNumberStation = 9;
    }

    public Radio() {
        maxQuantityRadioStation = 10;
    }

    public int getMinNumberStation() {
        return minNumberStation;
    }

    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public int getMaxQuantityRadioStation() {
        return maxQuantityRadioStation;
    }
}