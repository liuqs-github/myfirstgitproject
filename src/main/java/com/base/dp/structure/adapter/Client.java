package com.base.dp.structure.adapter;


public class Client {
	public static void main(String[] args) {
		Plugin p = new AmericaPluginAdapter();
		p.towPin();
		
		Plugin pp = new AmericaPluginNewAdapter(new AmericaPlugin());
		pp.threePin();
		
		WindowEvent we = new DefaultWindowAdapter(){
			public void close(){
				System.out.println("default windowadapter close !");
			}
		};
		we.close();
	}
}
