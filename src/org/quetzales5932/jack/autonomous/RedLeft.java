package org.quetzales5932.jack.autonomous;

import org.quetzales5932.jack.commands.CloseGear;
import org.quetzales5932.jack.commands.DoNothing;
import org.quetzales5932.jack.commands.DriveBackwards;
import org.quetzales5932.jack.commands.DriveForwards;
import org.quetzales5932.jack.commands.OpenGear;
import org.quetzales5932.jack.commands.TurnDegrees;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RedLeft extends CommandGroup {
	private final double waitTime = 1;

    public RedLeft() {
    	
    	addSequential(new DriveForwards(1.5));
        addSequential(new TurnDegrees(45));
        addSequential(new DriveForwards(1));
        addSequential(new OpenGear());
        addSequential(new DoNothing(waitTime));
        addSequential(new DriveBackwards(1));
        addSequential(new TurnDegrees(-45));
        addSequential(new DriveForwards(2));
        addSequential(new CloseGear());
        
        //addSequential(new DAB());
    
    }
}

