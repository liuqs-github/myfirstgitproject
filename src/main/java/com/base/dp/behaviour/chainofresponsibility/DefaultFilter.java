package com.base.dp.behaviour.chainofresponsibility;

public class DefaultFilter implements FilterChain{
	
	@Override
	public Object doFilter(String param) {
		System.out.println("this is defaultfilter");
		System.out.println("DefaultFilter handle");
		return "default";
	}
}
