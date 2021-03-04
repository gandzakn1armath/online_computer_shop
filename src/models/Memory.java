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

    public String getMemorySpace() {
        if (memorySpace == 1.0) {
            return memorySpace + "tb";
        }else{
            return memorySpace + "gb";
        }

    }

    public void setMemorySpace(double memorySpace) {
        this.memorySpace = memorySpace;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "name='" + name + '\'' +
                ", memoryType=" + memoryType +
                ", memorySpace=" + memorySpace +
                '}';
    }
}
