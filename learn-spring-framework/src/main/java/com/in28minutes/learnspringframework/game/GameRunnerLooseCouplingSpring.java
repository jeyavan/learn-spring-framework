package com.in28minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component  //class managed by spring framework
@Primary
public class GameRunnerLooseCouplingSpring {
	
	@Autowired                           //(field level injection)
	private GamingConsole  game2;
	

	public GameRunnerLooseCouplingSpring (GamingConsole  game2) {     //Constructor injection  
	System.out.println("Using constructor");
		this.game2=game2;
		}
	
	/*@Autowired
	public void setGame(GamingConsole game) {                        //setter injection
		System.out.println("Using setter");
		this.game = game;
	}*/


	public void runGame1() {
		game2.up();
		game2.down();
		game2.left();
		game2.right();
		
	}

 
}
