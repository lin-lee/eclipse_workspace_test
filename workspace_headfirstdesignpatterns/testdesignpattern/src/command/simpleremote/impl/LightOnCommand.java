package command.simpleremote.impl;

import command.simpleremote.Command;
import command.simpleremote.Light;

public class LightOnCommand implements Command {

	Light light;
	
	public LightOnCommand(Light light){
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();

	}

}
