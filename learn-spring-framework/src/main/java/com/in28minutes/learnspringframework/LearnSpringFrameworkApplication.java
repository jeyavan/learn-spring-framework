package com.in28minutes.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GameRunnerLooseCouplingSpring;
import com.in28minutes.learnspringframework.game.GameRunnerTightlyCoupled;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.SuperContraGameTightlyCoupled;


@SpringBootApplication     //when you click this, ctl+click
@ComponentScan({"com.in28minutes.learnspringframework","com.in28minutes.learnspringframework.game"})
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) { 
		
		//LooseCoupling-Spring
		
		ConfigurableApplicationContext context = 
		SpringApplication.run(LearnSpringFrameworkApplication.class, args);     //ctr+1
		
		//MarioGame has Component and GameRunner has Component
		//create object                               //method is getBean
		
		GameRunnerLooseCouplingSpring runner1= context.getBean(GameRunnerLooseCouplingSpring.class); 
		 runner1.runGame1(); 
		
		 //spring Bean-->An object managed by spring Framework
		
		
		//Tightly Coupled:
		
	   // MarioGameTightlyCoupled game=new MarioGameTightlyCoupled();                //import ctl+shift+o
		SuperContraGameTightlyCoupled game=new SuperContraGameTightlyCoupled();
		GameRunnerTightlyCoupled runner=new GameRunnerTightlyCoupled(game);
		runner.call();                                      //Tightly Coupled
		
		
		 //loose coupling:
		 
		    MarioGame game1=new MarioGame();
			//SuperContraGame game1=new SuperContraGame();
			GameRunner runner2=new GameRunner(game1);
			runner2.runGame();                            //loose coupling-interfaces
			
			
		
	}

}
