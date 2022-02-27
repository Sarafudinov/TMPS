import Builders.Builder;
import Enums.MemoryType;
import Enums.PcType;
import Enums.VideocardType;

public class Director {

    public void constructGaming1PC(Builder builder){

        builder.setPcType(PcType.Gaming_PC);
        builder.setRAMSize(16);
        builder.setMemorySize(512);
        builder.sedPowerSupplySize(750);
        builder.setMemory(MemoryType.SSD);
        builder.setVideoCard(VideocardType.RTX_3090_Ti);
    }

    public void constructGaming2PC(Builder builder){

        builder.setPcType(PcType.Gaming_PC);
        builder.setRAMSize(32);
        builder.setMemorySize(1024);
        builder.sedPowerSupplySize(100);
        builder.setMemory(MemoryType.HDD);
        builder.setVideoCard(VideocardType.Nvidia_RTX_A6000);
    }


    public void constructOfficePC(Builder builder){
        builder.setPcType(PcType.Office_PC);
        builder.setRAMSize(8);
        builder.setMemorySize(256);
        builder.sedPowerSupplySize(500);
        builder.setMemory(MemoryType.HDD);
        builder.setVideoCard(VideocardType.Intel_SBX275);
    }

}
