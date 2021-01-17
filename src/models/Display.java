package models;

public class Display {
    private String type;
    private double diagonal;
    private String resolution;

    public Display(String type, double diagonal, String resolution) {
        this.type = type;
        this.diagonal = diagonal;
        this.resolution = resolution;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDiagonal() {
        return diagonal;
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
}
