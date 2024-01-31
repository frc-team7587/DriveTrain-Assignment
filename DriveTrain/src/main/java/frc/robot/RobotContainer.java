// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.subsys.*;
import static frc.robot.Constants.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.*;


public class RobotContainer {
    // TODO: Explain what is happening here
    // It serves as the main hub for the robot's command structure
    

    public RobotContainer() {
        configureBindings();
        // TODO: Explain what is happening here
        // The constructor is where the robot's susbsystems, commands, and button bidnings are initialized
        // and configured. The call to configureBindings(); suggests that the button bindings for controlling
        // the robot will be set up in this method.
    }

    private void configureBindings() {
    }

    public Command getAutonomousCommand() {
        return Commands.print("No autonomous command configured");
    }
}