package Builders;

import Enums.*;

public interface Builder {

    void setRAMSize(int size);
    void setMemory(MemoryType type);
    void setMemorySize(int size);
    void setVideoCard(VideocardType videoCard);
    void sedPowerSupplySize(int size);
    void setPcType(PcType pcType);
}
