package com.ADP2;
public class Exe {
public static void main(String[] args) {
   Socket s = new WallSocket();
   MobileCharger C = new MCAdaptor(s);
   C.charge();
}
}
