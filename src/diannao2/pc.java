package diannao2;

import diannao1.cpu;

public class pc {
	protected cpu cpu;

	protected HardDisk hd;

    void setCpu(cpu cpu){

        this.cpu = cpu;

    }

    void setHardDisk(HardDisk hd){

        this.hd = hd;

    }



    void show(){

        System.out.println("cpu Ʒ�� " + cpu.getName());

        System.out.println("cpu �ٶ� " + cpu.getSpeed()+"ת");

        System.out.println("HardDisk �ڴ� " + hd.getAmount() + "GB");

        System.out.println("HardDisk ת�� " + hd.getSpeed()+"ת");

    }
}
