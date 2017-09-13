package org.quetzales5932.jack.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import org.quetzales5932.jack.Robot;

/**
 *
 */
public class ToogleRamp extends InstantCommand {

    public ToogleRamp() {
        super();
        // Use requires() here to declare subsystem dependencies
        requires(Robot.retriever);
    }

    // Called once when the command executes
    protected void initialize() {
    	if (Robot.retriever.isOpen()) Robot.retriever.closeRamp(); else Robot.retriever.openRamp();
    }

}
