package com.base.dp.behaviour.command;

public class Client {
	public static void main(String[] args) {
		AutoPlayer ap = new AutoPlayer();
		KeyPad dp = new KeyPad(new PlayCommand(ap),new StopCommand(ap),new RemindCommand(ap));
		dp.play();
		dp.stop();
		dp.remind();
	}
}
