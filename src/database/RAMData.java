package database;

import models.RAM;

import java.util.ArrayList;

public class RAMData {
    public static ArrayList<RAM> getRAMs(){
        ArrayList<RAM> rams = new ArrayList<>();
        rams.add(new RAM(4,"DDR3",3000));
        rams.add(new RAM(8,"DDR3",3200));
        rams.add(new RAM(16,"DDR4",3600));
        rams.add(new RAM(32,"DDR4",4400));
        return rams;
    }
}
