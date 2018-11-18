package com.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@SuppressWarnings("unused")
@Path("/home")
public class ProviderMsg {

	@Path("/msg")
	@GET
	//@Produces(MediaType.APPLICATION_JSON)
	@Produces("application/json")
	public Employee showEmp()
	{
		Employee emp = new Employee();
		emp.setEmpId(10);
		emp.setEmpName("Ashok");
		emp.setEmpSal(9.9);
		return null;
	}
}
