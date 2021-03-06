/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
//import frc.robot.subsystems.DriveTrain;

/**
 * This flips the direction of the drivetrain with a press of a button.
 * This means that if you are driving forward originially, then you press a button, you now drive backwards
 */
public class FlipDriveDirection extends Command
{
  public FlipDriveDirection()
  {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.robotDriveTrain);
  }

  // Called just before this Command runs the first time
  /**
   * Flips the direction of the drive train to the other way
   */
  @Override
  protected void initialize()
  {
    Robot.robotDriveTrain.flipDirection();
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute()
  {
    //No execute because all we need it to do is flip the direction
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished()
  {
    return true;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() 
  {

  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() 
  {
    
  }
}