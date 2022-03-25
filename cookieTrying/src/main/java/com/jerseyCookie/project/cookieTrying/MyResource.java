
package com.jerseyCookie.project.cookieTrying;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Path("/myresource")
public class MyResource {
    
    @GET 
    @Produces("text/plain")
    public String getIt() {
        return "Hi there!";
    }
}
