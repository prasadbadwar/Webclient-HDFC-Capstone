package com.hdfc.ems.client.controller;

import java.nio.charset.StandardCharsets;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.hdfc.ems.client.dto.EmployeeDTO;
import com.hdfc.ems.client.entity.Employee;
import com.hdfc.ems.client.util.AESDecrypt;

@RestController
@RequestMapping("/hdfc/emsclient/")
public class WebEmployeeController {
	
	@Autowired
	RestTemplate rest;
	String url="https://localhost:9191/hdfc/ems/";


	@GetMapping("/getemployeeinfo/{id}")
	public Employee getEmployeeData(@PathVariable long id) throws HttpClientErrorException,Exception{
		
		EmployeeDTO result =rest.getForObject(url+"/findemployee/"+id, EmployeeDTO.class);

		return getDTO(result);
	
	}
	
	public Employee getDTO(EmployeeDTO empdto) throws Exception{
		Employee emp=new Employee();
		byte[] dob=AESDecrypt.decrypt(empdto.getDateOfBirth());
		LocalDate date=LocalDate.parse(new String(dob,StandardCharsets.UTF_8));
		emp.setEmployeeId(empdto.getEmployeeId());
		emp.setEmployeeName(empdto.getEmployeeName());	
		emp.setDateOfBirth(date);	
		return emp;
	};
	
	
//	WebClient client=WebClient.create(url);
//	@GetMapping("/getinfo")
//	public Mono<String> get(@PathVariable long id)
//	{
//		Mono<String> mono=client.get().uri("/findemployee/"+id).retrieve().bodyToMono(String.class);
//		return mono;
//	}
}
