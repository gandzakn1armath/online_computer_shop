package models;

import enums.RAMType;

public class RAM {
    private int ramSize;
    private RAMType ramType;
    private double ramFrequency;

    public RAM(int ramSize, RAMType ramType, double ramFrequency) {
        this.ramSize = ramSize;
        this.ramType = ramType;
        this.ramFrequency = ramFrequency;
    }


    public String getRamSize() {
        return ramSize + "gb";
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public RAMType getRamType() {
        return ramType;
    }

    public void setRamType(RAMType ramType) {
        this.ramType = ramType;
    }

    public double getRamFrequency() {
        return ramFrequency;
    }

    public void setRamFrequency(double ramFrequency) {
        this.ramFrequency = ramFrequency;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "ramSize=" + ramSize +
                ", ramType=" + ramType +
                ", ramFrequency=" + ramFrequency +
                '}';
    }
}
