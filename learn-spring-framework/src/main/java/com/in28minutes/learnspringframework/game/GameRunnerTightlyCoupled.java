package com.in28minutes.learnspringframework.game;

public class GameRunnerTightlyCoupled {
private SuperContraGameTightlyCoupled game;	       //GameRunnerTightlyCoupled class tightly coupled with SuperContraGameTightlyCoupled class
/*private	MarioGameTightlyCoupled game;         //GameRunnerTightlyCoupled class tightly coupled with MarioGameTightlyCoupled class

public GameRunnerTightlyCoupled(MarioGameTightlyCoupled game) {
	this.game=game;
}*/

public GameRunnerTightlyCoupled(SuperContraGameTightlyCoupled game) {
	this.game=game;
}

	public void call() {
		game.uparrow();
		game.downarrow();
		game.leftarrow();
		game.rightarrow();
		
	}
	


}
