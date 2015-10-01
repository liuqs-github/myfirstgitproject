package com.base.dp.behaviour.chainofresponsibility;

public class Context {
	 
	private FilterChain chain;

	public FilterChain getChain() {
		return chain;
	}

	public void setChain(FilterChain chain) {
		this.chain = chain;
	}
	
	public Object hanlde(String name){
		return chain.doFilter(name);
	}
}
