package models;

public class CPU {
    private String name;
    private int cpuCoreCount;
    private double cpuMaximumFrequency;


    public CPU(String name, int cpuCoreCount, double cpuMaximumFrequency) {
        this.name = name;
        this.cpuCoreCount = cpuCoreCount;
        this.cpuMaximumFrequency = cpuMaximumFrequency;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getCpuCoreCount() {
        return cpuCoreCount;
    }

    public void setCpuCoreCount(int cpuCoreCount) {
        this.cpuCoreCount = cpuCoreCount;
    }

    public double getCpuMaximumFrequency() {
        return cpuMaximumFrequency;
    }

    public void setCpuMaximumFrequency(double cpuMaximumFrequency) {
        this.cpuMaximumFrequency = cpuMaximumFrequency;
    }
}
