
package com.jerseyEmployee.project.EmployeeProj;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlRootElement;

/** Example resource class hosted at the URI path "/myresource"
 */

@XmlRootElement
@Path("/employee")
public class MyResource {
	/* @GET 
	    @Produces("text/plain")
	    public String getIt() {
	        return "Hi there!";
	    }
	
*/
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@POST
	public String showAll(@FormParam("name")String name, @FormParam("department")String department) {
		return name+" "+department;
		
		
	}
	
	
	@Produces(MediaType.TEXT_PLAIN)
	@GET
	@Path("{name:[A-Z]}")
	public String showAll(@QueryParam("name")String name) {
		return name;
		
		
	}
	
	
	static List<Employee>e=new ArrayList<Employee>();
	static {
	Employee e1= new Employee(1,"Sandhya"," FullSatck Developer");
	Employee e2= new Employee(2,"MAnya","UI Developer");
	Employee e3= new Employee(3,"Madhu","Backend Developer");
	
	e.add(e1);e.add(e2);e.add(e3);
	
	}
	
	
	@Path("/deleteById/{id}")
	@Produces(MediaType.TEXT_XML)
	@POST
	public Response del(@PathParam("id")int id){
		Employee temp=null;
		boolean isFound=false;
		for (Employee emps: e) {
			if (emps.getId()==id) {
				isFound=true;
				temp=emps;
				break;
			}
		}
		if (isFound){
			e.remove(temp);
			return Response.status(200).entity(temp).build();
		}
		else {
			return Response.status(200).entity("NOT FOUND!!!").build();
		}
		
	}
	
	@Path("/insert/{id}/{name}/{department}")
	@Produces(MediaType.TEXT_XML)
	@GET
	public List<Employee> insert(@PathParam("id")int id,@PathParam("name")String name,@PathParam("department")String department ){
	Employee temp=new Employee(id, name, department);
	e.add(temp);
	return show();
	}
	
	
	
	@Path("/updateById/{id}/{name}/{department}")
	@Produces(MediaType.TEXT_XML)
	@GET
	public List<Employee> update(@PathParam("id")int id,@PathParam("name")String name,@PathParam("department")String department ){
		boolean isFound=false;
		for (Employee emps: e) {
			if (emps.getId()==id) {
				isFound=true;
				emps.setName(name);
				emps.setDepartment(department);
				break;
			}
		}
		if (isFound){
			return show();
		}
	Employee temp=new Employee(id, name, department);
	e.add(temp);
	return show();
	}
	
	
	 @GET
	    @Path("/test")
	    public String testQueryParam(
	            @DefaultValue("praveen")
	            @QueryParam("name") String name, 
	            @DefaultValue("Hyderabad")
	            @QueryParam("city") String city
	    		) {
	        return "Name= " + name+" City  = "+city;
	    }
	
	
	@Path("/showAll")
	@Produces(MediaType.TEXT_XML)
	@GET
	public List<Employee> show() {
		GenericEntity<List<Employee>>l= new GenericEntity<List<Employee>>(e) {};
		return l.getEntity();
		
		
	}
	
	
	
	
	
	@Path("/getById/{id}")
	@Produces(MediaType.TEXT_XML)
	@GET
	public Response searchEmp(@PathParam("id")int id) {
		Employee temp=null;
		boolean isFound=false;
		for (Employee emps: e) {
			if (emps.getId()==id) {
				isFound=true;
				temp=emps;
				break;
			}
		}
		if (isFound){
			return Response.status(200).entity(temp).build();
		}
		else {
			return Response.status(200).entity("NOT FOUND!!!").build();
		}
	}
	
    
    }
