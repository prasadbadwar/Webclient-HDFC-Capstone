/* =========================
  * @Author : Er.Prasad B.Badwar.
  * 
  * @Date : 21/04/2023
  * 
  * @Description : Employee Entity Class
  * ==========================
  * */
package com.hdfc.ems.client.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor


public class EmployeeDTO {

	private long employeeId;
	
	private String employeeName;
	
	private byte[] dateOfBirth;
	
	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public byte[] getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(byte[] dateOfBirth) {
		this.dateOfBirth =dateOfBirth;
	}

	
	
	
}
