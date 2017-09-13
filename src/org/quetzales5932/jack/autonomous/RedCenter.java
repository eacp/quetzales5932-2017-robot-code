package org.quetzales5932.jack.autonomous;

import org.quetzales5932.jack.commands.DriveForwards;
import org.quetzales5932.jack.commands.TurnDegrees;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RedCenter extends CommandGroup {

    public RedCenter() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

    	addSequential(new Center());
    	addSequential(new TurnDegrees(-90));
        addSequential(new DriveForwards(1.5));
        addSequential(new TurnDegrees(90));
        addSequential(new DriveForwards(2));
    }
}
