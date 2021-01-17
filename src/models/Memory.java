package models;


import enums.MemoryType;

public class Memory {
    private String name;
    private MemoryType memoryType;
    private double memorySpace;

    public Memory(String name, MemoryType memoryType, double memorySpace) {
        this.name = name;
        this.memoryType = memoryType;
        this.memorySpace = memorySpace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MemoryType getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(MemoryType memoryType) {
        this.memoryType = memoryType;
    }

    public double getMemorySpace() {
        return memorySpace;
    }

    public void setMemorySpace(double memorySpace) {
        this.memorySpace = memorySpace;
    }
}
