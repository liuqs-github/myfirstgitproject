package com.base.dp.create.factory.abst;

public class LinuxCreater implements Creator{

	@Override
	public Button buttonFactory() {
		return new LinuxButton();
	}

	@Override
	public Text textFactory() {
		return new LinuxText();
	}

}
