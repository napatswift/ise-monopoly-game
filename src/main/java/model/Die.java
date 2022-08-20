package model;

import java.util.Random;

public class Die {
    private int faceValue;

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public void roll() {
        Random rand = new Random();
        this.faceValue = rand.nextInt(6) + 1;
    }
}
