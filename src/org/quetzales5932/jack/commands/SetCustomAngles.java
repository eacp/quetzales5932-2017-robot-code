package org.quetzales5932.jack.commands;

import org.quetzales5932.jack.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class SetCustomAngles extends InstantCommand {
	private int ang1;
	private int ang2;

    public SetCustomAngles(int a1,int a2) {
        super();
        ang1 = a1;
        ang2 = a2;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called once when the command executes
    protected void initialize() {
    	Robot.gearContainer.setServos(ang1, ang2);
    }

}
