package com.base.dp.behaviour.chainofresponsibility;

public class SecurityFilter implements FilterChain{

	private FilterChain filterChain;

	public FilterChain getFilterChain() {
		return filterChain;
	}

	public void setFilterChain(FilterChain filterChain) {
		this.filterChain = filterChain;
	}
	
	@Override
	public Object doFilter(String param) {
		System.out.println("this is securityfilter");
		if(param.equals("security")){
			System.out.println("SecurityFilter handle");
			return "security";
		}
		return filterChain.doFilter(param);
	}

}
