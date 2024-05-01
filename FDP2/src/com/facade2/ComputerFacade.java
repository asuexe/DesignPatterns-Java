package com.facade2;

class ComputerFacade implements Computer {
private CPU cpu;
private Memory memory;
private SSD ssd;

public ComputerFacade() {
   this.cpu = new CPU();
   this.memory = new Memory();
   this.ssd = new SSD();
}

@Override
public void turnOn() {
   cpu.start();
   memory.initialize();
   ssd.loadOS();
}

@Override
public void turnOff() {
   cpu.shutdown();
   memory.release();
   ssd.powerOff();
}

@Override
public void reboot() {
   turnOff();
   turnOn();
}
}