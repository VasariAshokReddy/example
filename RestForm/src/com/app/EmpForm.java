package com.app;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/emp")
public class EmpForm {
@POST
@Path("/data")
	public String showData(@FormParam("eid")int id,
			@FormParam("ename")String name
			,@FormParam("esal")double sal)
	{
		return "Hello:"+id+","+name+","+sal;
	}

	
}

