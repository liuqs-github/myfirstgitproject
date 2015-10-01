package com.base.dp.behaviour.chainofresponsibility;

public class LogFilter implements FilterChain{

	private FilterChain filterChain;

	public FilterChain getFilterChain() {
		return filterChain;
	}

	public void setFilterChain(FilterChain filterChain) {
		this.filterChain = filterChain;
	}

	@Override
	public Object doFilter(String param) {
		System.out.println("this is logfilter");
		if(param.equals("log")){
			System.out.println("LogFilter handle");
			return "log";
		}
		return filterChain.doFilter(param);
	}

}
