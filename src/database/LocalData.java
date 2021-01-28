package database;

import enums.DisplayType;
import enums.MemoryType;
import enums.RAMType;
import models.*;

import java.util.ArrayList;

public class LocalData {
    public static ArrayList<Brand>getBrandData(){
        ArrayList<Brand> brands = new ArrayList<>();
        brands.add(new Brand("Asus"));
        brands.add(new Brand("Apple"));
        brands.add(new Brand("Lenovo"));
        brands.add(new Brand("Acer"));
        brands.add(new Brand("Dell"));        
        brands.add(new Brand("Hp"));
        return brands;
    }
    public static ArrayList<CPU> getCPUs(){
        ArrayList<CPU> cpus = new ArrayList<>();
        cpus.add(new CPU("Intel I3",2,3.5));
        cpus.add(new CPU("Intel I5",4,3.9));
        cpus.add(new CPU("Intel I7",6,4.4));
        cpus.add(new CPU("Intel I9",8,5.0));
        return cpus;
    }
    public static ArrayList<Display> getDisplays(){
        ArrayList<Display> displays = new ArrayList<>();
        displays.add(new Display(DisplayType.TN,13,"1366X786"));
        displays.add(new Display(DisplayType.TN,17.3,"1920x1080"));
        displays.add(new Display(DisplayType.IPS,13,"1366X786"));
        displays.add(new Display(DisplayType.IPS,17.3,"1920x1080"));
        return displays;
    }
    public static ArrayList<GPU> getGPUs(){
        ArrayList<GPU> gpus = new ArrayList<>();
        gpus.add(new GPU("Intel UHD","Intel","Intel",1));
        gpus.add(new GPU("NvidiA Gtx 1050","NvidiA","Gtx 1050",3));
        gpus.add(new GPU("NvidiA Rtx 2080 Super","NvidiA","Rtx 2080 Super",8));
        gpus.add(new GPU("NvidiA Rtx 3090","NvidiA","3090",24));
        return gpus;
    }
    public static ArrayList<Memory> getMemories(){
        ArrayList<Memory> memories = new ArrayList<>();
        memories.add(new Memory("Western Digital", MemoryType.SSD,500));
        memories.add(new Memory("Seagate Barracuda", MemoryType.HDD,1));
        memories.add(new Memory("Toshiba Sattelite", MemoryType.HDD,256));
        memories.add(new Memory("Samsung 970 Pro", MemoryType.SSD,1));
        return memories;
    }
    public static ArrayList<RAM> getRAMs(){
        ArrayList<RAM> rams = new ArrayList<>();
        rams.add(new RAM(4, RAMType.DDR3,3000));
        rams.add(new RAM(8,RAMType.DDR3,3200));
        rams.add(new RAM(16,RAMType.DDR4,3600));
        rams.add(new RAM(32,RAMType.DDR4,4400));
        return rams;
    }
    public static ArrayList<Computer> getAsus(){
       ArrayList<Computer> asus = new ArrayList<>();
       asus.add(new Computer(getBrandData().get(0),getCPUs().get(2),getRAMs().get(2),
               getMemories().get(3),getDisplays().get(3),getGPUs().get(2)));
       asus.add(new Computer(getBrandData().get(0),getCPUs().get(1),getRAMs().get(1),
                getMemories().get(3),getDisplays().get(3),getGPUs().get(0)));
       return asus;
    }
    public static ArrayList<Computer> getApple(){
        ArrayList<Computer> apple = new ArrayList<>();
        apple.add(new Computer(getBrandData().get(1),getCPUs().get(2),getRAMs().get(2),
                getMemories().get(3),getDisplays().get(3),getGPUs().get(2)));
        apple.add(new Computer(getBrandData().get(1),getCPUs().get(1),getRAMs().get(1),
                getMemories().get(3),getDisplays().get(3),getGPUs().get(0)));
        return apple;
    }
    public static ArrayList<Computer> getLenovo(){
        ArrayList<Computer> lenovo = new ArrayList<>();
        lenovo.add(new Computer(getBrandData().get(2),getCPUs().get(2),getRAMs().get(2),
                getMemories().get(3),getDisplays().get(3),getGPUs().get(2)));
        lenovo.add(new Computer(getBrandData().get(2),getCPUs().get(1),getRAMs().get(1),
                getMemories().get(3),getDisplays().get(3),getGPUs().get(0)));
        return lenovo;
    }
    public static ArrayList<Computer> getAcer(){
        ArrayList<Computer> acer = new ArrayList<>();
        acer.add(new Computer(getBrandData().get(3),getCPUs().get(2),getRAMs().get(2),
                getMemories().get(3),getDisplays().get(3),getGPUs().get(2)));
        acer.add(new Computer(getBrandData().get(3),getCPUs().get(1),getRAMs().get(1),
                getMemories().get(3),getDisplays().get(3),getGPUs().get(0)));
        return acer;
    }
    public static ArrayList<Computer> getDell(){
        ArrayList<Computer> dell = new ArrayList<>();
        dell.add(new Computer(getBrandData().get(4),getCPUs().get(2),getRAMs().get(2),
                getMemories().get(3),getDisplays().get(3),getGPUs().get(2)));
        dell.add(new Computer(getBrandData().get(4),getCPUs().get(1),getRAMs().get(1),
                getMemories().get(3),getDisplays().get(3),getGPUs().get(0)));
        return dell;
    }
    public static ArrayList<Computer> getHp(){
        ArrayList<Computer> hp = new ArrayList<>();
        hp.add(new Computer(getBrandData().get(5),getCPUs().get(2),getRAMs().get(2),
                getMemories().get(3),getDisplays().get(3),getGPUs().get(2)));
        hp.add(new Computer(getBrandData().get(5),getCPUs().get(1),getRAMs().get(1),
                getMemories().get(3),getDisplays().get(3),getGPUs().get(0)));
        return hp;
    }
}
