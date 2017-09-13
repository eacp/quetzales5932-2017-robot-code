package org.quetzales5932.jack.autonomous;

import org.quetzales5932.jack.commands.CloseGear;
import org.quetzales5932.jack.commands.DoNothing;
import org.quetzales5932.jack.commands.DriveBackwards;
import org.quetzales5932.jack.commands.DriveForwards;
import org.quetzales5932.jack.commands.OpenGear;
import org.quetzales5932.jack.commands.TurnDegrees;

import edu.wpi.first.wpilibj.command.CommandGroup;


public class RedRight extends CommandGroup {
	//--------------AJUSTAR VALORES AQUI--------------
	private final int degrees = 45;
	private final double initialTime = 1.5;
	private final double diagonalTime = 0.5;
	private final double waitTime = 1;
	
    public RedRight() {
    	//adelante
    	addSequential(new DriveForwards(initialTime));
    	//doblar en diagonal y avanzar
        addSequential(new TurnDegrees(-degrees));
        addSequential(new DriveForwards(diagonalTime));
        //abrir
        addSequential(new OpenGear());
        //esperar a que abra
        addSequential(new DoNothing(waitTime));
        //regresar el mismo tiempo y doblar
        addSequential(new DriveBackwards(diagonalTime));
        addSequential(new TurnDegrees(degrees));
        
        addSequential(new CloseGear());
        //addSequential(new DAB());
    }
}
