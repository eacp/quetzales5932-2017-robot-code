package org.quetzales5932.jack.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *Ball Retriever:
 *
 *@author Eduardo Castillo
 *@author Ian Carnevalli
 *
 *
 *Note: This System was unused because the requerided hardware was not totally built.
 */
public class BallRetriever extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	//This subsystem uses a ramp
	private Servo rampServo1 = new Servo(5), rampServo2 = new Servo(3);
	private TalonSRX motors = new TalonSRX(10); //its actually 2 motors, but they share the same PWM thanks to a Y connector
	
	private RampState rState;
	private MotorState mState;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void openRamp() {
    	//it was really hard to find this angle because he had to do a lot of testing. We thank your sacrifice, Ian
		rampServo1.setAngle(45.0);
		rampServo2.set(135.0);
		startMotors();
		rState = RampState.OPEN;
	}
    
    public void closeRamp() {
    	rampServo1.setAngle(0.0);
		rampServo2.set(0.0);
		stopMotors();
		rState = RampState.CLOSED;
	}
    
    public void stopMotors() {
    	motors.set(0.0);
    	mState = MotorState.NOT_RUNNING;
    }
    
    public void startMotors() {
    	//again, Ian, we thank you for your patience and strange passion for finding constants through trial and error
    	//you deserve a pizza
    	motors.set(0.72); 
    	mState = MotorState.RUNNING;
    }
    
    public boolean isOpen() {
		return rState == RampState.OPEN;
	}
    
    public enum MotorState{RUNNING,NOT_RUNNING}
    public enum RampState{OPEN,CLOSED}
}

