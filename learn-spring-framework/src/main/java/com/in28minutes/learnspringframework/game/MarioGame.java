package com.in28minutes.learnspringframework.game;

public class MarioGame implements GamingConsole {
	@Override
	public void up() {
		System.out.println("Jump MarioGame");
		
	}
	@Override
	public void down() {
		System.out.println("faster MarioGame");
		
	}
	@Override
	public void left() {
		System.out.println("slow down MarioGame");
		
	}
	@Override
	public void right() {
		System.out.println("stop MarioGame");
		
	}

}
