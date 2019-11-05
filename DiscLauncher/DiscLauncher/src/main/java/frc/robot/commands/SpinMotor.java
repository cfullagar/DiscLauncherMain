/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;


public class SpinMotor extends Command {

  double globalSpeed = 0;
  int spinTime = 0;
  boolean spinState = false;

  public SpinMotor() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.launcher);
  }

  public SpinMotor(int time, double spinSpeed)
  {
    globalSpeed = spinSpeed;
    spinTime = time;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    setTimeout(spinTime);
    Robot.launcher.setSpinSpeed(globalSpeed);


    //Attempting to slowly ramp up the motor speed 

    // double x = 0.10;
    // while (x <= globalSpeed)
    // {
    //   x += 0.05;
    //   Robot.launcher.setSpinSpeed(x);
    // //Robot.launcher.setSpinSpeed(globalSpeed);
    // }

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

    //Robot.launcher.setSpinSpeed(RobotMap.spinSpeedVar);
    
    //Robot.launcher.setSpinSpeed(globalSpeed);

    //setTimeout(2);
    //spinState = true;

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return isTimedOut();  //added this to deal with the setTimeout in the initialize function
    //return false;  //original code included with command
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.launcher.setSpinSpeed(0);  //added to confirm stopping speed at the end
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    Robot.launcher.setSpinSpeed(0);
    end();
  }

  public boolean getSpinState()
  {
    return spinState;
  }

  public void setSpinState(boolean state)
  {
    spinState = state;
  }
}
