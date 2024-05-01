package com.EX1;

import java.util.HashMap;
import java.util.Map;
public class DigitalAssistant {
	private Map<String, Command> Comm;
	DigitalAssistant() {
		Comm = new HashMap<String, Command>();
	}
	public void registerCommaand(String Key,Command command) {
		Comm.put(Key, command);
		}
	public void ExecuteCommand(String Key) {
		if(Comm.containsKey(Key)) {
			Comm.get(Key).execute();
		}
		else {
			System.out.println("Umknown Command");
		}
	}
	}
