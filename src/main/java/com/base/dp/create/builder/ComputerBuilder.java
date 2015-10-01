package com.base.dp.create.builder;

/**
 * 可以同样创建一个汽车的创建者，用于汽车的创建，
 * 导演者添加汽车的创建方法
 * @author Administrator
 *
 */
public class ComputerBuilder implements ProductBuilder{

	public Computer product ;
	
	@Override
	public void collectInfo() {
		product = new Computer();
		product.setHost(new Host("changcheng"));
		product.setScreen(new Screen("crt"));
	}

	@Override
	public void buildComponenet() {
		product.getHost().setAge(12);
		product.getScreen().setSize(12);
	}

	@Override
	public void test() {
		product.getHost().execute();
		product.getScreen().display();
	}

	@Override
	public Product getProduct() {
		return product;
	}

}
