package frc.robot.subsystems;

import static frc.robot.Constants.*;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;


public class Drivetrain extends SubsystemBase {
    // TODO: Declare four VictorSPX motor controllers
    private final WPI_VictorSPX leftFront, leftRear, rightFront, rightRear;
    // TODO: Declare two MotorControllerGroup for the left motors and right motors
    private final MotorControllerGroup leftMotors, rightMotors;
    // TODO: Declare a DifferentialDrive using the left and right motor controller groups
    private final DifferentialDrive drive;
    /** Constructs a Drivetrain subsystem */
    public Drivetrain() {
        // TODO: For each motor controller, create a new object and specify their CAN ID in the parameter from the Constants class
        leftFront = new WPI_VictorSPX(kLeftFrontMotorID);
        leftRear = new WPI_VictorSPX(kLeftRearMotorID);
        rightFront = new WPI_VictorSPX(kRightFrontMotorID);
        rightRear = new WPI_VictorSPX(kRightRearMotorID);
        // TODO: For each MotorControllerGroup, create a new object and group the appropriate motors. Explain why in a new comment.
        leftMotors = new MotorControllerGroup(leftFront, leftRear);
        rightMotors = new MotorControllerGroup(rightFront, rightRear);
        // TODO: Create a new DifferentialDrive object using the MotorControllerGroups
        drive = new DifferentialDrive(leftMotors, rightMotors);
        // TODO: Invert the right motor controller group. Explain why in a new comment.
        rightMotors.setInverted(true);
        // TODO: Configure factory defaults for each motor. Explain why in a new comment.
        leftFront.configFactoryDefault();
        leftRear.configFactoryDefault();
        rightFront.configFactoryDefault();
        rightRear.configFactoryDefault();
    }

    /**
     * Drives the robot using arcade drive
     * @param velocity The velocity of the robot
     * @param rotation The rotation of the robot
     */
    public void drive(double velocity, double rotation) {
        // TODO: Call the arcadeDrive() method of the DifferentialDrive object you created.
        drive.arcadeDrive(velocity, rotation);
    }

    public void stop() {
        drive.arcadeDrive(0,0);
    }

    @Override
    public void periodic() {
        // This method does not need to be completed, hover over periodic() and read the documentation.
    }
}
