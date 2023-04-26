/* =========================
  * @Author : Er.Prasad B.Badwar.
  * 
  * @Date : 21/04/2023
  * 
  * @Description : Employee pojo Class
  * ==========================
  * */
package com.hdfc.ems.client.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Employee {

	private long employeeId;
	
	private String employeeName;
	
	private LocalDate dateOfBirth;
}
