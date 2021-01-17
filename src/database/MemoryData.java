package database;

import enums.MemoryType;
import models.Memory;

import java.util.ArrayList;

public class MemoryData {
    public static ArrayList<Memory> getMemories(){
        ArrayList<Memory> memories = new ArrayList<>();
        memories.add(new Memory("Western Digital", MemoryType.SSD,500));
        memories.add(new Memory("Seagate Barracuda", MemoryType.HDD,1));
        memories.add(new Memory("Toshiba Sattelite", MemoryType.HDD,256));
        memories.add(new Memory("Samsung 970 Pro", MemoryType.SSD,1));
        return memories;
    }
}
