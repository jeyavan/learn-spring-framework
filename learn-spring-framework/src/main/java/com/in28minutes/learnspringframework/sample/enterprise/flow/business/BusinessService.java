//Responsible of business logic
package com.in28minutes.learnspringframework.sample.enterprise.flow.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.sample.enterprise.flow.dataservice.DataService;

@Component
public class BusinessService{            //business layer
	@Autowired
 private DataService dataservice;
	public long calculateSum() {
	 List<Integer> data= dataservice.retrieveDate();
	return data.stream().reduce(Integer::sum).get();
	
}
	
}
//getting data from database
