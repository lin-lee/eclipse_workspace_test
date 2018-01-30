package command.simpleremote.main;

import command.simpleremote.GarageDoor;
import command.simpleremote.Light;
import command.simpleremote.impl.GarageDoorOpenCommand;
import command.simpleremote.impl.LightOnCommand;
import command.simpleremote.impl.SimpleRemoteControl;

public class RemoteControlTest {
	
	public static void main(String [] args){
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageOpenCommand = 
				new GarageDoorOpenCommand(garageDoor);
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		remote.setCommand(garageOpenCommand);
		remote.buttonWasPressed();
	}

}
