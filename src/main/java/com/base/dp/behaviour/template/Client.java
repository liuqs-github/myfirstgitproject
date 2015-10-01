package com.base.dp.behaviour.template;

public class Client {
	public static void main(String[] args) {
		Context c = new Context();
		c.setServlet(new HtmlHttpServlet());
		c.handleReuqest("get", "jaks");
	}
}
