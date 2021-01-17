package database;


import models.GPU;

import java.util.ArrayList;

public class GPUData {
    public static ArrayList<GPU> getGPUs(){
        ArrayList<GPU> gpus = new ArrayList<>();
        gpus.add(new GPU("Intel UHD","Intel","Intel",1));
        gpus.add(new GPU("NvidiA Gtx 1050","NvidiA","Gtx 1050",3));
        gpus.add(new GPU("NvidiA Rtx 2080 Super","NvidiA","Rtx 2080 Super",8));
        gpus.add(new GPU("NvidiA Rtx 3090","NvidiA","3090",24));
        return gpus;
    }
}
