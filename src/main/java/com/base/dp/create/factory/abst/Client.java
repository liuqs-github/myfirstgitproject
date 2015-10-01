package com.base.dp.create.factory.abst;

/**
 * 当新添加一个产品族时，如添加一个Mac族
 * 只需添加一个MacCreator，和对应下的产品，MacButton，MacText
 * 
 * 产品族个数与工厂个数一致
 * 
 * 当增加产品等级结构时，抽象工厂不支持开闭原则，如增加一个TextBox的产品
 * 需要修改所有的工厂方法
 * 
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		Creator c = new WinCreator();
		c.buttonFactory().click();
		c.textFactory().show("hello");
	}
}
