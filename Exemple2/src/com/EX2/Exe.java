package com.EX2;

public class Exe {

	public static void main(String[] args) {
		LevelSetter L = new LevelSetter();
		Game G1 = new EasyGame();
		L.SetLevel(G1);
		G1.play();
		Game G2 = new HardGame();
		L.SetLevel(G2);
		G2.play();
		
	}

}
