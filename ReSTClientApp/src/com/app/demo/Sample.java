package com.app.demo;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Sample {

	public static void main(String[] args) {

		Client c = Client.create();
		String url = "http://localhost:2018/ReSTFulWebservice/rest/reddy/vasari";
		WebResource wr = c.resource(url);
		ClientResponse cr = (ClientResponse) wr.get(ClientResponse.class);
		String s = (String) cr.getEntity(String.class);
		System.out.println(s);
		System.out.println(cr.getStatus());
		System.out.println(cr.getStatusInfo());
	}

}
