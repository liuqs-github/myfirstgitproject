package com.base.dp.create.prototype;

import java.io.Serializable;

public interface Prototype extends Cloneable,Serializable{
	
	public Object clone();
	
	public Object deepClone();
}
