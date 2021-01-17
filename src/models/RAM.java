package models;

public class RAM {
    private int ramSize;
    private String ramType;
    private double ramFrequency;

    public RAM(int ramSize, String ramType, double ramFrequency) {
        this.ramSize = ramSize;
        this.ramType = ramType;
        this.ramFrequency = ramFrequency;
    }


    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getRamType() {
        return ramType;
    }

    public void setRamType(String ramType) {
        this.ramType = ramType;
    }

    public double getRamFrequency() {
        return ramFrequency;
    }

    public void setRamFrequency(double ramFrequency) {
        this.ramFrequency = ramFrequency;
    }
}
