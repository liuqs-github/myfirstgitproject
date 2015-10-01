package com.base.dp.structure.adapter;

/**
 * 默认适配器
 * @author Administrator
 *
 */
public class DefaultWindowAdapter implements WindowEvent{

	@Override
	public void close() {
		System.out.println("this is default close");
	}

	@Override
	public void beforeClose() {
		System.out.println("this is default before close");
	}

	@Override
	public void destroy() {
		System.out.println("this is destroy");
	}

}
