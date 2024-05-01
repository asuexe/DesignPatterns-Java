package com.EX1;

public class Exe {

	public static void main(String Args[]) {
		DigitalAssistant a = new DigitalAssistant();
		Command C1 = new OpenMailCommand();
		Command C2 = new OpenVideoCommand();
		
		a.registerCommaand("Open the Mail", C1);
		a.ExecuteCommand("Open the Mail");
	}
	
}
