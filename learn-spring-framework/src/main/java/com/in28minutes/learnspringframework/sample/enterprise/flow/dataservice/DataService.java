package com.in28minutes.learnspringframework.sample.enterprise.flow.dataservice;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DataService{                 //data layer

	public List<Integer>retrieveDate(){
		
		return Arrays.asList(12,34,56,78,50);
	}
	
	
}