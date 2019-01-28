/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.*;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem 
{
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  static DifferentialDrive drive = RobotMap.diffDrive;
  static Joystick driverStick = RobotMap.driverStick;

  @Override
  public void initDefaultCommand() 
  {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  /*public DriveTrain(DifferentialDrive diffDrive, Joystick stick){
    // drive = new DriveTrain(frontLeft, rearLeft, frontRight, rearRight));
    drive = diffDrive;
    driverStick = stick;
  }*/

  public static void robotDrive(){
    double xSpeed = driverStick.getRawAxis(RobotMap.DRIVER_LEFT_X_AXIS) * -1; // makes forward stick positive
    double zRotation =  driverStick.getRawAxis(RobotMap.DRIVER_RIGHT_Y_AXIS); // WPI Drivetrain uses positive=> right; right stick for left and right

    drive.arcadeDrive(xSpeed, zRotation);
  }
}
