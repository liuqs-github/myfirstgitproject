package com.base.dp.behaviour.template;

/**
 * 环境主要调用service方法实现商业逻辑，
 * 这里server方法禁止被子类继承修改，子类只负责，商业逻辑的具体实现
 * @author Administrator
 *
 */
public abstract class HttpServlet {

	/**
	 * 此为模板方法
	 * @param type
	 * @param name
	 */
	public final void service(String type,String name){
		if(type.equals("get")){
			this.doGet(name);
		}else{
			this.doPost(name);
		}
	}
	/**
	 * 抽象方法列表，待子类实现的
	 * @param param
	 */
	public abstract void doPost(String param);
	
	public abstract void doGet(String param);

	/**
	 * 具体方法：供子类或父类调用使用，或外部调用
	 */
	public void show(){
		System.out.println("show");
	}
	
	/**
	 * 父类的默认实现方法，子类根据需要实现
	 * 如缺省适配器
	 */
	public void test(){
		
	}
}
