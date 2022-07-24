
package com.cts.employeemicroservice.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cts.employeemicroservice.repository.EmployeeRepository;
import com.cts.employeemicroservice.service.EmployeeService;



@SpringBootTest
public class EmployeeControllerTest {
   
	@InjectMocks
	EmployeeController employeeController; 
 
	@Mock
	EmployeeService empservice;
	
	@Mock
	EmployeeRepository repository;
	
	
	
    @Test
    @DisplayName("Checking for EmployeeController - whether it is loading or not for @GetMapping")
    void employeeControllerNotNullTest(){
        assertThat(employeeController).isNotNull();
    }
    
    @Test
    public void viewofferstest()
    {
    	
    	
    }
    
    
	
    
    
}