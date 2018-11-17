package org.sathya;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements DisposableBean, InitializingBean {

	
	private int empId;

	public Employee() {
		super();
		
		System.out.println("Default constructor...");
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + "]";
	}

	public void afterPropertiesSet() throws Exception {
              
		System.out.println("Init-method");

	}

	public void destroy() throws Exception {
		
		System.out.println("Destroy-method");
	}

}
