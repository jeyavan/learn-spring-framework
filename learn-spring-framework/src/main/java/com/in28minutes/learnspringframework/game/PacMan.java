package com.in28minutes.learnspringframework.game;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class PacMan implements GamingConsole {
	public void up() {
		System.out.println("Up PacMan game");
		
	}
	public void down() {
		System.out.println("Down PacMan game");
		
	}
	public void left() {
		System.out.println("Left PacMan game");
		
	}
	public void right() {
		System.out.println("Right PacMan game");
		
	}

}
