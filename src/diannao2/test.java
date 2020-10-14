package diannao2;

import diannao1.cpu;

public class test {
	public static void main(String[] args){

        cpu cpu = new cpu();

        HardDisk hd = new HardDisk();

        cpu.setName("AMD");

        cpu.setSpeed(2200);

        hd.setAmount(200);

        hd.setSpeed(5400, null);

        pc pc = new pc();

        pc.setCpu(cpu);

        pc.setHardDisk(hd);

        pc.show();

    }

}
