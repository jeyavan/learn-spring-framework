package com.in28minutes.learnspringframework.sample.enterprise.flow.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.learnspringframework.sample.enterprise.flow.business.BusinessService;

//sending the responsible in the right format
@RestController
public class Controller {      //web layer
@Autowired	
private BusinessService businessService;	
	
//"/sum"=>100                //hard code
@GetMapping("/sum")	
public long displaySum() {
	//return 100;
	return businessService.calculateSum();
	

}
}
