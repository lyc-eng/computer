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

        System.out.println("cpu 品牌 " + cpu.getName());

        System.out.println("cpu 速度 " + cpu.getSpeed()+"转");

        System.out.println("HardDisk 内存 " + hd.getAmount() + "GB");

        System.out.println("HardDisk 转数 " + hd.getSpeed()+"转");

    }
}
