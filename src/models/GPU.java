package models;

public class GPU {
    private String name;
    private String gpuManufacturer;
    private String gpuController;
    private int gpuMemory;

    public GPU(String name, String gpuManufacturer, String gpuController, int gpuMemory) {
        this.name = name;
        this.gpuManufacturer = gpuManufacturer;
        this.gpuController = gpuController;
        this.gpuMemory = gpuMemory;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGpuManufacturer() {
        return gpuManufacturer;
    }

    public void setGpuManufacturer(String gpuManufacturer) {
        this.gpuManufacturer = gpuManufacturer;
    }

    public String getGpuController() {
        return gpuController;
    }

    public void setGpuController(String gpuController) {
        this.gpuController = gpuController;
    }

    public int getGpuMemory() {
        return gpuMemory;
    }

    public void setGpuMemory(int gpuMemory) {
        this.gpuMemory = gpuMemory;
    }

    @Override
    public String toString() {
        return "GPU{" +
                "name='" + name + '\'' +
                ", gpuManufacturer='" + gpuManufacturer + '\'' +
                ", gpuController='" + gpuController + '\'' +
                ", gpuMemory=" + gpuMemory +
                '}';
    }
}
