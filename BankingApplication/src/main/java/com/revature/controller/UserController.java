package com.revature.controller;

import java.sql.Connection;

import com.revature.models.User;
import com.revature.dao.UserDAO;

import io.javalin.Javalin;
import io.javalin.http.Handler;

public class UserController {
	
	Javalin app;
	Connection connection;
	UserDAO userDAO;
	
	public UserController(Javalin app, Connection c) {
		this.app = app;
		this.connection = c;
		userDAO = new UserDAO();
		
		app.post("/users", createUser);
		app.get("/users/{username}", getUser);
		app.put("/users/update/{username}", updateUsername);
		app.delete("/users/delete/{username}", deleteUser);

	}
	
	public Handler createUser = ctx -> {
		
		User createdUser = ctx.bodyAsClass(User.class);
		
		if (UserDAO.createUser(createdUser))
			
			ctx.status(201); 
		
		else ctx.status(400);
	};
	
	public Handler getUser = ctx -> {
		
		User haveUser = UserDAO.getUser(ctx.pathParam("username"));
		
		ctx.json(haveUser);
		
		ctx.status(200);
	};
	
	public Handler updateUsername = ctx -> {
		
		boolean updatedUser = userDAO.updateUsername(ctx.pathParam("username"));
		ctx.json(updatedUser);
			
			ctx.status(204);
		
	};

	public Handler deleteUser = ctx -> {

		
		boolean deletedUser = userDAO.deleteUser(ctx.pathParam("Username"));
		
		ctx.json(deletedUser);
		
			ctx.status(204);
			
	
	};

}