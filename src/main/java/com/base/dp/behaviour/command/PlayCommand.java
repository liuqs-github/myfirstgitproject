package com.base.dp.behaviour.command;

public class PlayCommand implements Command{

	private AutoPlayer autoPlayer;
	
	public PlayCommand(AutoPlayer autoPlayer){
		this.autoPlayer = autoPlayer;
	}
	@Override
	public void execute() {
		autoPlayer.play();
	}

}
