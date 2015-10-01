package com.base.dp.behaviour.template;

public class Context {
	
	private HttpServlet servlet;

	public Context(){}
	
	public Context(HttpServlet servlet){
		this.servlet = servlet;
	}
	
	public HttpServlet getServlet() {
		return servlet;
	}

	public void setServlet(HttpServlet servlet) {
		this.servlet = servlet;
	}
	
	public void handleReuqest(String type,String param){
		System.out.println("context handle request");
		servlet.service(type, param);
	}
	
}
