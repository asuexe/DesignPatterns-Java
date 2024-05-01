package com.EX4;

public class Exe {
	public static void main(String[] args) {
	    VirtualWorld world = new VirtualWorld();

	    VirtualBox box1 = new VirtualBox(0, 0, 0, 2);
	    VirtualSphere sphere1 = new VirtualSphere(5, 0, 0, 1);
	    VirtualSphere sphere2 = new VirtualSphere(-5, 0, 0, 1);

	    world.addObject(box1);
	    world.addObject(sphere1);
	    world.addObject(sphere2);

	    for (int i = 0; i < 100; i++) {
	        world.update();
	        try {
	            Thread.sleep(100);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}


}
