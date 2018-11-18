package com.app;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Test {

	public static void main(String[] args) {

		Client c = Client.create();
		//define one url
		String URL = "http://localhost:2018/ReSTFulWebservice/rest/ashok/ramya";
		//add url to client object
		WebResource wr = c.resource(URL);
		//cal get/post method on webResource object
		ClientResponse cr = (ClientResponse) wr.get(ClientResponse.class);
		//read entity from ClientResponse.
		String s = (String) cr.getEntity(String.class);
		//print msg
		System.out.println(s);
		System.out.println(cr.getStatus());
		System.out.println(cr.getStatusInfo());
	}

}
