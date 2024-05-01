package com.ADP2;
class MCAdaptor implements MobileCharger {
private Socket socket;
public MCAdaptor(Socket socket) {
   this.socket = socket;}
public void charge() {
   int volts = socket.getVolts();
   if (volts == 240) {
       System.out.println("Charging mobile with " + volts + " volts");
   } else {
       System.out.println("Cannot charge mobile with " + volts + " volts");
   }
}
}

