package org.quetzales5932.jack.commands;

import org.quetzales5932.jack.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *Este comando mistico setea la velocidad de los diferentes motores. 
 *Se acciona desde el joystick.
 *Las velocidades se definen en el archivo RobotMap
 *
 *Aunque esta disenado para funcionar con estas velocidades, el comando como tal
 *acepta cualquier velocidad como parametro
 */
public class SetSpeed extends InstantCommand {
	private double m_speed;

    public SetSpeed(double speed) {
        super();
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        m_speed = speed;
    }

    // Called once when the command executes
    protected void initialize() {
    	Robot.chassis.speed = m_speed;
    	Robot.climber.speed = m_speed;
    	//publicar info para facilitar la vida a los drivers
    	System.out.println("Velocidad cambiada a " + m_speed);
    	SmartDashboard.putNumber("Velocidad",m_speed);
    }

}
