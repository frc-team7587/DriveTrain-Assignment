package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MotorConstants;

public class DriveTrain extends SubsystemBase {
    private final WPI_VictorSPX leftFront, leftBack, rightFront, rightBack;
    private final MotorControllerGroup leftMotors, rightMotors;
    private final DifferentialDrive driveTrain;

    public DriveTrain(){
        leftFront = new WPI_VictorSPX(MotorConstants.leftFrontMotorID);
        leftBack = new WPI_VictorSPX(MotorConstants.leftBackMotorID);
        rightFront = new WPI_VictorSPX(MotorConstants.rightFrontMotorID);
        rightBack = new WPI_VictorSPX(MotorConstants.rightBackMotorID);

        leftMotors = new MotorControllerGroup(leftFront, leftBack);
        rightMotors = new MotorControllerGroup(rightFront, rightBack);

        driveTrain = new DifferentialDrive(leftMotors, rightMotors);
        rightMotors.setInverted(true);

        leftFront.configFactoryDefault();
        leftBack.configFactoryDefault();
        rightFront.configFactoryDefault();
        rightBack.configFactoryDefault();
    }
    
    public void drive(double velocity, double rotation){
        driveTrain.arcadeDrive(velocity, rotation);
    }

    @Override
    public void periodic(){

    }
}
