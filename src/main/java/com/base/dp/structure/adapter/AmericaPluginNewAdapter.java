package com.base.dp.structure.adapter;

/**
 * 此时使用聚合实现
 * @author Administrator
 *
 */
public class AmericaPluginNewAdapter implements Plugin{

	private AmericaPlugin americaPlugin;
	
	public AmericaPluginNewAdapter(AmericaPlugin americaPlugin){
		this.americaPlugin = americaPlugin;
	}
	public AmericaPlugin getAmericaPlugin() {
		return americaPlugin;
	}

	public void setAmericaPlugin(AmericaPlugin americaPlugin) {
		this.americaPlugin = americaPlugin;
	}

	@Override
	public void towPin() {
		System.out.println("america threepin");
		
	}

	@Override
	public void threePin() {
		americaPlugin.threePin();
		
	}

}
