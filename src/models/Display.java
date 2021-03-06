package models;

import enums.DisplayType;

public class Display {
    private DisplayType type;
    private double diagonal;
    private String resolution;

    public Display(DisplayType type, double diagonal, String resolution) {
        this.type = type;
        this.diagonal = diagonal;
        this.resolution = resolution;
    }

    public DisplayType getType() {
        return type;
    }

    public void setType(DisplayType type) {
        this.type = type;
    }

    public String getDiagonal() {
        return diagonal+"in";
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return type +
                "," + diagonal +
                "," + resolution;
    }
}
