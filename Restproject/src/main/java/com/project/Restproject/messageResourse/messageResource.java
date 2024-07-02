package com.project.Restproject.messageResourse;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.*;  
import com.project.Restproject.messageService.*;
import com.project.Restproject.model.*;


@Path("messages")
public class messageResource {

messageService service= new messageService();

@GET
@Produces(MediaType.APPLICATION_JSON)
public List<messages> allmessages(){
	return service.getAllMessages();
}


@GET
@Path("/{id}")
@Produces(MediaType.APPLICATION_JSON)
public messages singleMessage(@PathParam ("id") long id){
	return service.getMessage(id);
}

@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public messages postMessage(messages message){
	return service.addMessage(message);
}


@PUT
@Path("/{id}")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public messages updateMessage(@PathParam ("id") long id, messages message){
	message.setId(id);
	return service.updateMessage(message);
}

@DELETE
@Path("/{id}")
@Produces(MediaType.APPLICATION_JSON)
public void deleteMessage(@PathParam ("id") long id){
	 service.removeMessage(id);
}
}
