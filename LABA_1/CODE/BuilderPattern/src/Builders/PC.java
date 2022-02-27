package Builders;

import Enums.MemoryType;
import Enums.PcType;
import Enums.VideocardType;

public class PC {
    private PcType pcType;
    private int ramSize;
    private int memorySize;
    private int powerSupplySize;
    private MemoryType memoryType;
    private VideocardType videocardType;

    public PC() {
    }

    public PC(PcType pcType, int ramSize, int memorySize, int powerSupplySize, MemoryType memoryType, VideocardType videocardType) {
        this.pcType = pcType;
        this.ramSize = ramSize;
        this.memorySize = memorySize;
        this.powerSupplySize = powerSupplySize;
        this.memoryType = memoryType;
        this.videocardType = videocardType;
    }

    public PcType getPcType(){
        return pcType;
    }

    @Override
    public String toString() {
        return  "\n\tRam size: " + ramSize +
                "\n\tMemory size: " + memorySize +
                "\n\tPower supply size: " + powerSupplySize +
                "\n\tMemory type: " + memoryType +
                "\n\tVideocard type: " + videocardType;
    }
}
