package Builders;

import Enums.MemoryType;
import Enums.PcType;
import Enums.VideocardType;

public class GamingPcBuilder implements Builder{

    private PcType pcType;
    private int ramSize;
    private int memorySize;
    private int powerSupplySize;
    private MemoryType memoryType;
    private VideocardType videocardType;

    @Override
    public void setRAMSize(int size) {
        this.ramSize = size;
    }

    @Override
    public void setMemory(MemoryType type) {
        this.memoryType = type;
    }

    @Override
    public void setMemorySize(int size) {
        this.memorySize = size;
    }

    @Override
    public void setVideoCard(VideocardType videoCard) {
        this.videocardType = videoCard;
    }

    @Override
    public void sedPowerSupplySize(int size) {
        this.powerSupplySize = size;
    }

    public void setPcType(PcType pcType) {
        this.pcType = pcType;
    }

    public PC getResult() {
        return new PC(pcType, ramSize, memorySize, powerSupplySize, memoryType, videocardType);
    }
}
