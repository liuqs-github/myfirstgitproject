package com.base.dp.create.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 也可使用记录式原型模式，聚合一个集聚对象保存原型
 * @author Administrator
 *
 */
public class Person implements Prototype{

	private static final long serialVersionUID = -2925807912981834493L;
	
	private int age;
	
	private String name;
	
	private boolean sex;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public void display(){
		System.out.println("age : "+age +" name : "+name+" sex :" +sex);
	}
	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj =  super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public Object deepClone() {
		Object obj = null;
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(this);
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			obj = ois.readObject();
			oos.close();
			baos.close();
			ois.close();
			bais.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return obj;
	}
	

}
