package database;

import enums.MemoryType;
import models.Display;
import models.Memory;

import java.util.ArrayList;

public class DisplayData {
    public static ArrayList<Display> getDisplays(){
        ArrayList<Display> displays = new ArrayList<>();
        displays.add(new Display("TN",13,"1366X786"));
        displays.add(new Display("TN",17.3,"1920x1080"));
        displays.add(new Display("IPS",13,"1366X786"));
        displays.add(new Display("TN",17.3,"1920x1080"));
        return displays;
    }
}
