package com.in28minutes.learnspringframework.game;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGameLooseCouplingSpring  implements GamingConsole{
	
	@Override
	public void up() {
		System.out.println("Jump loose coupling Spring");
		
	}
	@Override
	public void down() {
		System.out.println("faster loose coupling Spring");
		
	}
	@Override
	public void left() {
		System.out.println("slow down loose coupling Spring");
		
	}
	@Override
	public void right() {
		System.out.println("stop loose coupling Spring");
		
	}


}
