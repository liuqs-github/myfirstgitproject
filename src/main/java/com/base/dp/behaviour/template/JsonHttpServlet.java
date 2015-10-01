package com.base.dp.behaviour.template;

public class JsonHttpServlet extends HttpServlet{

	@Override
	public void doPost(String param) {
		System.out.println("this is handle Json post request");
	}

	@Override
	public void doGet(String param) {
		System.out.println("this is handle Json post request");
		
	}

}
