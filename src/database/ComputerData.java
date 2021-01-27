package database;

import models.CPU;
import models.Computer;
import models.RAM;

import java.util.ArrayList;

public class ComputerData {
    public static ArrayList<Computer> getAsus(){
       ArrayList<Computer> asus = new ArrayList<>();
       asus.add(new Computer(BrandData.getBrandData().get(0),CPUData.getCPUs().get(2),RAMData.getRAMs().get(2),
               MemoryData.getMemories().get(3),DisplayData.getDisplays().get(3),GPUData.getGPUs().get(2)));
       asus.add(new Computer(BrandData.getBrandData().get(0),CPUData.getCPUs().get(1),RAMData.getRAMs().get(1),
                MemoryData.getMemories().get(3),DisplayData.getDisplays().get(3),GPUData.getGPUs().get(0)));
       return asus;
    }
    public static ArrayList<Computer> getApple(){
        ArrayList<Computer> apple = new ArrayList<>();
        apple.add(new Computer(BrandData.getBrandData().get(1),CPUData.getCPUs().get(2),RAMData.getRAMs().get(2),
                MemoryData.getMemories().get(3),DisplayData.getDisplays().get(3),GPUData.getGPUs().get(2)));
        apple.add(new Computer(BrandData.getBrandData().get(1),CPUData.getCPUs().get(1),RAMData.getRAMs().get(1),
                MemoryData.getMemories().get(3),DisplayData.getDisplays().get(3),GPUData.getGPUs().get(0)));
        return apple;
    }
    public static ArrayList<Computer> getLenovo(){
        ArrayList<Computer> lenovo = new ArrayList<>();
        lenovo.add(new Computer(BrandData.getBrandData().get(2),CPUData.getCPUs().get(2),RAMData.getRAMs().get(2),
                MemoryData.getMemories().get(3),DisplayData.getDisplays().get(3),GPUData.getGPUs().get(2)));
        lenovo.add(new Computer(BrandData.getBrandData().get(2),CPUData.getCPUs().get(1),RAMData.getRAMs().get(1),
                MemoryData.getMemories().get(3),DisplayData.getDisplays().get(3),GPUData.getGPUs().get(0)));
        return lenovo;
    }
    public static ArrayList<Computer> getAcer(){
        ArrayList<Computer> acer = new ArrayList<>();
        acer.add(new Computer(BrandData.getBrandData().get(3),CPUData.getCPUs().get(2),RAMData.getRAMs().get(2),
                MemoryData.getMemories().get(3),DisplayData.getDisplays().get(3),GPUData.getGPUs().get(2)));
        acer.add(new Computer(BrandData.getBrandData().get(3),CPUData.getCPUs().get(1),RAMData.getRAMs().get(1),
                MemoryData.getMemories().get(3),DisplayData.getDisplays().get(3),GPUData.getGPUs().get(0)));
        return acer;
    }
    public static ArrayList<Computer> getDell(){
        ArrayList<Computer> dell = new ArrayList<>();
        dell.add(new Computer(BrandData.getBrandData().get(4),CPUData.getCPUs().get(2),RAMData.getRAMs().get(2),
                MemoryData.getMemories().get(3),DisplayData.getDisplays().get(3),GPUData.getGPUs().get(2)));
        dell.add(new Computer(BrandData.getBrandData().get(4),CPUData.getCPUs().get(1),RAMData.getRAMs().get(1),
                MemoryData.getMemories().get(3),DisplayData.getDisplays().get(3),GPUData.getGPUs().get(0)));
        return dell;
    }
    public static ArrayList<Computer> getHp(){
        ArrayList<Computer> hp = new ArrayList<>();
        hp.add(new Computer(BrandData.getBrandData().get(5),CPUData.getCPUs().get(2),RAMData.getRAMs().get(2),
                MemoryData.getMemories().get(3),DisplayData.getDisplays().get(3),GPUData.getGPUs().get(2)));
        hp.add(new Computer(BrandData.getBrandData().get(5),CPUData.getCPUs().get(1),RAMData.getRAMs().get(1),
                MemoryData.getMemories().get(3),DisplayData.getDisplays().get(3),GPUData.getGPUs().get(0)));
        return hp;
    }
}
