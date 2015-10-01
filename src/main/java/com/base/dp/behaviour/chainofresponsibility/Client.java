package com.base.dp.behaviour.chainofresponsibility;

public class Client {
	public static void main(String[] args) {
		LogFilter lf = new LogFilter();
		SecurityFilter sf = new SecurityFilter();
		CharacterFilter cf = new CharacterFilter();
		DefaultFilter df = new DefaultFilter();
		lf.setFilterChain(sf);
		sf.setFilterChain(cf);
		cf.setFilterChain(df);
		Context ctx = new Context();
		ctx.setChain(lf);
		ctx.hanlde("log");
	}
}
