package frc.robot.subsys;

import static frc.robot.Constants.*;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;


public class DriveTrain extends SubsystemBase {
    private final WPI_VictorSPX leftFront, leftBack, rightFront, rightBack;
    private final MotorControllerGroup leftMotors, rightMotors;
    private final DifferentialDrive drive;

    public DriveTrain() {
        leftFront = new WPI_VictorSPX(LFMotor);
        leftBack = new WPI_VictorSPX(LBMotor);
        rightFront = new WPI_VictorSPX(RFMotor);
        rightBack = new WPI_VictorSPX(RBMotor);

        leftMotors = new MotorControllerGroup(leftFront, leftBack);
        rightMotors = new MotorControllerGroup(rightFront, rightBack);

        drive = new DifferentialDrive(leftMotors, rightMotors);

        rightMotors.setInverted(true);

        leftFront.configFactoryDefault();
        leftBack.configFactoryDefault();
        rightFront.configFactoryDefault();
        rightBack.configFactoryDefault();
    }

    public void drive(double velocity, double rotation) {
        drive.arcadeDrive(velocity, rotation);
    }

    public void stop() {
        drive.arcadeDrive(0,0);
    }

    @Override
    public void periodic() {
        
    }
}
