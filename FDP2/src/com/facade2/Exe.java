package com.facade2;

public class Exe {
	public static void main(String[] args) {
	    Computer c = new ComputerFacade();
	    c.turnOn();
	    c.reboot();
	    c.turnOff();
	}

}
