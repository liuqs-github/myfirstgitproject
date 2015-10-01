package com.base.dp.behaviour.chainofresponsibility;

public class CharacterFilter implements FilterChain{
	
	private FilterChain filterChain;

	public FilterChain getFilterChain() {
		return filterChain;
	}

	public void setFilterChain(FilterChain filterChain) {
		this.filterChain = filterChain;
	}
	
	@Override
	public Object doFilter(String param) {
		System.out.println("this is characterfilter");
		if(param.equals("character")){
			System.out.println("Character handle");
			return "character";
		}
		return filterChain.doFilter(param);
	}
}
