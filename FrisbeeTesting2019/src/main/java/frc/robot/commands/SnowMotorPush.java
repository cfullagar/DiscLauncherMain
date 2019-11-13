/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.DiscPusherWiperMotor;

public class SnowMotorPush extends Command {

  int angleDistance = 0;
  double globalSpeed = 0;
  double spinTime = 0;


  public SnowMotorPush() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.snowPush);
  }

  // public SnowMotorPush(int distanceSet)
  // {
  //   requires(Robot.snowPush);
  //   angleDistance = distanceSet;
  // }

  public SnowMotorPush(double time, double speed)
  {
    requires(Robot.snowPush);
    globalSpeed = speed;
    spinTime = time;
  }


  // Called just before this Command runs the first time
  @Override
  protected void initialize() {

    //Robot.snowPush.pushForward(angleDistance);

    setTimeout(spinTime);
    Robot.snowPush.setSpinSpeed(globalSpeed);

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    
    return isTimedOut();
    //return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {

    //Robot.snowPush.pushForward(0);

    Robot.snowPush.setSpinSpeed(0);

  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {

    Robot.launcher.setSpinSpeed(0);
    end();

    // Robot.snowPush.pushForward(0);
    //  end();
  }
}
