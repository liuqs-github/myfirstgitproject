package com.base.dp.behaviour.chainofresponsibility;

/**
 * 此时实现的纯责任链，即如果自己不处理交由下级处理，
 * 不纯时，即自己处理一部分下级再进行下部分处理
 * @author Administrator
 *
 */
public interface FilterChain {

	public Object doFilter(String param);
	
}
