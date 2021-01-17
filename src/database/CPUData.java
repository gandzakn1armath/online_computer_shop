package database;

import models.CPU;

import java.util.ArrayList;

public class CPUData {
    public static ArrayList<CPU> getCPUs(){
        ArrayList<CPU> cpus = new ArrayList<>();
        cpus.add(new CPU("Intel I3",2,3.5));
        cpus.add(new CPU("Intel I5",4,3.9));
        cpus.add(new CPU("Intel I7",6,4.4));
        cpus.add(new CPU("Intel I9",8,5.0));
        return cpus;
    }
}
