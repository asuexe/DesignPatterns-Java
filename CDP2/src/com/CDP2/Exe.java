package com.CDP2;

public class Exe {
    public static void main(String[] args) {
        Component hardDisk = new Item("Hard Disk", 100);
        Component mouse = new Item("Mouse", 20);
        Component monitor = new Item("Monitor", 200);
        Component ram = new Item("RAM", 50);

        Composite peripherals = new Composite("Peripherals");
        Composite cabinet = new Composite("Cabinet");
        Composite motherBoard = new Composite("Motherboard");
        Composite computer = new Composite("Computer");

        peripherals.addComponent(mouse);
        peripherals.addComponent(monitor);
        cabinet.addComponent(hardDisk);
        cabinet.addComponent(peripherals);
        motherBoard.addComponent(ram);
        motherBoard.addComponent(cabinet);
        computer.addComponent(motherBoard);

        computer.showPrice();
    }
}