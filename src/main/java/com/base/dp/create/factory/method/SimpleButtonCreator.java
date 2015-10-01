package com.base.dp.create.factory.method;

public class SimpleButtonCreator implements Creator{

	@Override
	public Button factory() {
		return new SimpleButton();
	}

	
}
