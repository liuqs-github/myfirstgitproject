package com.base.dp.behaviour.command;

public class KeyPad {

	private Command play;
	private Command stop;
	private Command remind;
	
	public KeyPad(Command play, Command stop, Command remind) {
		super();
		this.play = play;
		this.stop = stop;
		this.remind = remind;
	}

	public void play(){
		play.execute();
	}
	
	public void stop(){
		stop.execute();
	}
	
	public void remind(){
		remind.execute();
	}
}
