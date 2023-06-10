package com.in28minutes.learnspringframework.game;

public class GameRunner {
//private SuperContraGame game;
private GamingConsole game1;	

public GameRunner(GamingConsole game1) {    
	
	this.game1=game1;
	}

public void runGame() {
	game1.up();
	game1.down();
	game1.left();
	game1.right();
}

}
