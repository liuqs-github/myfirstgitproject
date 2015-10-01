package com.base.dp.behaviour.template;

public class HtmlHttpServlet extends HttpServlet{

	@Override
	public void doPost(String param) {
		System.out.println("this is handle html post request");
	}

	@Override
	public void doGet(String param) {
		System.out.println("this is handle html get request");
	}

}
