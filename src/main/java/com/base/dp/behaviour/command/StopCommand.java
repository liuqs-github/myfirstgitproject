package com.base.dp.behaviour.command;

public class StopCommand implements Command{

	private AutoPlayer autoPlayer;
	
	public StopCommand(AutoPlayer autoPlayer){
		this.autoPlayer = autoPlayer;
	}
	@Override
	public void execute() {
		autoPlayer.stop();
	}

}
