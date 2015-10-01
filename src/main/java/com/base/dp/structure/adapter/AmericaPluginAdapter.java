package com.base.dp.structure.adapter;

/**
 * 此时使用集成实现适配器
 * @author Administrator
 *
 */
public class AmericaPluginAdapter extends AmericaPlugin implements Plugin{

	@Override
	public void towPin() {
		System.out.println("america threepin");
		
	}

}
