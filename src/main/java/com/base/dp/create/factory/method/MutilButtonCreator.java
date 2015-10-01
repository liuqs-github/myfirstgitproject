package com.base.dp.create.factory.method;

public class MutilButtonCreator implements Creator{

	@Override
	public Button factory() {
		return new MutilButton();
	}

}
