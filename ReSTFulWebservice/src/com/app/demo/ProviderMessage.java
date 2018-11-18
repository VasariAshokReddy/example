package com.app.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/reddy")
public class ProviderMessage {

	@GET
	@Path("/vasari")
	@Produces(MediaType.APPLICATION_JSON)
	//@Produces("application/json")
	public Employee showEmp()
	{
		Employee emp = new Employee();
		emp.setEmpId(10);
		emp.setEmpName("Ashok");
		emp.setEmpSal(9.9);
		return emp;
	}
}