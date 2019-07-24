package patterns.Facade;

import patterns.Facade.components.CPU;
import patterns.Facade.components.HardDrive;
import patterns.Facade.components.Memory;

public class Computer {

    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        cpu.freeze();
       /* memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.jump(BOOT_ADDRESS);*/
        cpu.execute();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startComputer();
    }
}
