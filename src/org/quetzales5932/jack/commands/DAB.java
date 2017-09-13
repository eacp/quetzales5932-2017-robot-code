package org.quetzales5932.jack.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *La clase DAB es un comando que hace el DAB
 *Recibe como argumento si se desea que gire
 *al hacer el DAB.
 */
public class DAB extends CommandGroup {
	//es obvio lo que hace
	
    public DAB(boolean turn) {
    	//esto es si deseamos un giro
    	if (turn) {
    		addSequential(new TurnDegrees(-180));
		}
    	addSequential(new SetCustomAngles(180, 90));
    	//addSequential(new DoNothing(0.2));
    }
    //por default no hacemos ningun giro
    public DAB(){
    	this(false);
    }
}
