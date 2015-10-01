package com.base.dp.behaviour.command;

public class RemindCommand implements Command{

	private AutoPlayer autoPlayer;
	
	public RemindCommand(AutoPlayer autoPlayer){
		this.autoPlayer = autoPlayer;
	}
	@Override
	public void execute() {
		autoPlayer.remind();
	}
}
