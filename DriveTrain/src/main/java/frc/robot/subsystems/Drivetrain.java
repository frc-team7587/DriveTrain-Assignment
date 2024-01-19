package frc.robot.subsystems;

import static frc.robot.Constants.*;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;


public class Drivetrain extends SubsystemBase {
    // TODO: Declare four VictorSPX motor controllers

    // TODO: Declare two MotorControllerGroup for the left motors and right motors

    // TODO: Declare a DifferentialDrive using the left and right motor controller groups
    
    /** Constructs a Drivetrain subsystem */
    public Drivetrain() {
        // TODO: For each motor controller, create a new object and specify their CAN ID in the parameter from the Constants class
        
        // TODO: For each MotorControllerGroup, create a new object and group the appropriate motors. Explain why in a new comment.

        // TODO: Create a new DifferentialDrive object using the MotorControllerGroups
        
        // TODO: Invert the right motor controller group. Explain why in a new comment.

        // TODO: Configure factory defaults for each motor. Explain why in a new comment.
    }

    /**
     * Drives the robot using arcade drive
     * @param velocity The velocity of the robot
     * @param rotation The rotation of the robot
     */
    public void drive(double velocity, double rotation) {
        // TODO: Call the arcadeDrive() method of the DifferentialDrive object you created.
    }

    @Override
    public void periodic() {
        // This method does not need to be completed, hover over periodic() and read the documentation.
    }
}
