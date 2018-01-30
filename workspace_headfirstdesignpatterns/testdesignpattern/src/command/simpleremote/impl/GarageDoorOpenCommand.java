package command.simpleremote.impl;

import command.simpleremote.Command;
import command.simpleremote.GarageDoor;

public class GarageDoorOpenCommand implements Command {

	GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor){
		this.garageDoor = garageDoor;
	}
	@Override
	public void execute() {
		garageDoor.up();

	}

}
