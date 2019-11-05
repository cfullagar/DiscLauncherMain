/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.DiscPusherMech;

public class DiscPusher extends Command {
  int angleDistance = 0;
  
  
  public DiscPusher() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.discPush);
  }

  public DiscPusher(int distanceSet)
  {
    angleDistance = distanceSet;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {

    
    Robot.discPush.pushForward(angleDistance);
    
    

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {

      Robot.discPush.pushForward(0);

  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {

    Robot.discPush.pushForward(0);
     end();

  }
}
