package com.base.dp.create.factory.abst;

public class WinCreator implements Creator{

	@Override
	public Button buttonFactory() {
		return new Winbutton();
	}

	@Override
	public Text textFactory() {
		return new WinText();
	}

}
