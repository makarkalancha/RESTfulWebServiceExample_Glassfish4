package org.mycompany.webservices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;


@Path("ConversionService")
public class FeetToInchAndInchToFeetConversionService {
	//http://localhost:8080/RESTfulWebServiceExample_Glassfish4/rest/ConversionService/InchToFeet/2
	@Path("/InchToFeet/{i}")
	@GET
	@Produces(MediaType.TEXT_XML)
	public String convertInchToFeet(@PathParam("i") int i){
		int inch = i;
		double feet = 0;
		feet = (double) inch / 12;
		return "<InchToFeetService>"+
				"<Inch>"+inch+"</Inch>"+
				"<Feet>"+feet+"</Feet>"+
				"</InchToFeetService>";
	}
	
	//http://localhost:8080/RESTfulWebServiceExample_Glassfish4/rest/ConversionService/FeetToInch/2
	@Path("/FeetToInch/{f}")
	@GET
	@Produces(MediaType.TEXT_XML)
	public String convertFeetToInch(@PathParam("f") int f){
		int feet = f;
		int inch = 0;		
		inch = feet * 12;
		return "<FeetToInchService>"+
				"<Feet>"+feet+"</Feet>"+		
				"<Inch>"+inch+"</Inch>"+
				"</FeetToInchService>";
	}

}
