package models;


public class Computer {
    private Brand brand;
    private CPU processor;
    private RAM ram;
    private Memory memory;
    private Display display;
    private GPU videoCard;
    private int price;

    public Computer(Brand brand, CPU processor, RAM ram, Memory memory, Display display, GPU videoCard, int price) {
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
        this.memory = memory;
        this.display = display;
        this.videoCard = videoCard;
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public CPU getProcessor() {
        return processor;
    }

    public RAM getRam() {
        return ram;
    }

    public Memory getMemory() {
        return memory;
    }

    public Display getDisplay() {
        return display;
    }

    public GPU getVideoCard() {
        return videoCard;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return brand.getName() +
                ", " + processor.getName() +
                ", " + ram.getRamSize() +
                ",\n   " + memory.getMemorySpace() +
                ", " + display.toString() +
                ",\n   " + videoCard.getName()+
                ",\nPrice - " + price;
    }

    public String printAll() {
        return "Brand - " + brand.getName() +
                "\nCPU - " + processor.getName() +
                "\nCPU Cores - " + processor.getCpuCoreCount() +
                "\nCPU Maximum Frequency - " + processor.getCpuMaximumFrequency() +
                "\nRAM Size - " + ram.getRamSize() +
                "\nRam Type - " + ram.getRamType() +
                "\nRam Frequency - " + ram.getRamFrequency() +
                "\nMemory Name - " + memory.getName() +
                "\nMemory Space - " + memory.getMemorySpace() +
                "\nMemory Type - " + memory.getMemoryType() +
                "\nDisplay Diagonal/Resolution - " + display.getResolution() + "/" + display.getResolution() +
                "\nVideoCard Name - " + videoCard.getName() +
                "\nVideoCard Manufacturer - " + videoCard.getGpuManufacturer() +
                "\nVideoCard Controller - " + videoCard.getGpuController() +
                "\nVideoCard Memory - " + videoCard.getGpuMemory()+
                ",\n\nPrice - " + price ;
    }
}
