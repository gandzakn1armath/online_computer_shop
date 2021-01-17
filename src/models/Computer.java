package models;


public class Computer {
    private Brand brand;
    private CPU processor;
    private RAM ram;
    private Memory memory;
    private Display display;
    private GPU videoCard;

    public Computer(Brand brand, CPU processor, RAM ram, Memory memory, Display display, GPU videoCard) {
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
        this.memory = memory;
        this.display = display;
        this.videoCard = videoCard;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setProcessor(CPU processor) {
        this.processor = processor;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public void setVideoCard(GPU videoCard) {
        this.videoCard = videoCard;
    }
}
