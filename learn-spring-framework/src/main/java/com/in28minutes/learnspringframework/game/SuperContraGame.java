package com.in28minutes.learnspringframework.game;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class SuperContraGame implements GamingConsole {
	public void up() {
		System.out.println("Up SuperContraGame");
		
	}
	public void down() {
		System.out.println("Down SuperContraGame");
		
	}
	public void left() {
		System.out.println("Left SuperContraGame");
		
	}
	public void right() {
		System.out.println("Right SuperContraGame");
		
	}

}
