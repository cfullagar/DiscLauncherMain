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
import frc.robot.OI;

public class TankDrive extends Command {
  public TankDrive() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.driveTrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    
    //Code implementing lower speed on button press

    // double TarsSpeed; 

    // if (Robot.m_oi.leftBumper.get() == true) {

    //     TarsSpeed = Robot.m_oi.GetDriverRawAxis(1) * RobotMap.testingSpeed;

    // }

    // else {

    //     TarsSpeed = Robot.m_oi.GetDriverRawAxis(1) * (RobotMap.drivingSpeed + ((Robot.m_oi.GetDriverRawAxis(2)) * (1 - RobotMap.drivingSpeed)));

    // }

    // if (0.05 > TarsSpeed && TarsSpeed > -0.05) {

    //     TarsSpeed = 0;

    // }



    // double TarsRotation;

    // if (Robot.m_oi.rightBumper.get() == true) {

    //     TarsRotation = Robot.m_oi.GetDriverRawAxis(4) * 0.55;

    // }

    // else {

    //     TarsRotation = Robot.m_oi.GetDriverRawAxis(4) * RobotMap.practiceSpeed;

    // }

    // if (0.05 > TarsRotation && TarsRotation > -0.05) {

    //     TarsRotation = 0;

    // }

    // Robot.driveTrain.ArcadeDrive(-TarsSpeed, TarsRotation);













    //double xSpeed = RobotMap.testingSpeed * Robot.m_oi.GetDriverRawAxis(1);



    //working code starts here

    double ySpeed = RobotMap.testingSpeed * Robot.m_oi.GetDriverRawAxis(0);
    double xSpeed = RobotMap.testingSpeed * Robot.m_oi.GetDriverRawAxis(1);

    Robot.driveTrain.ArcadeDrive(xSpeed, ySpeed);


    //working code ends here



    
    //ORIGINAL CODE
    // double leftStickY = Robot.m_oi.GetDriverRawAxis(RobotMap.leftStickInput);
    // double rightStickY = Robot.m_oi.GetDriverRawAxis(RobotMap.rightStickInput);

    // Robot.driveTrain.setLeftMotors(leftStickY * 0.5);  //would be a good idea to squar this var instead of 0.5 bc exponential sensativity
    // Robot.driveTrain.setRightMotors(rightStickY * 0.5);

    


  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    
    Robot.driveTrain.ArcadeDrive(0, 0);


    //ORIGINAL CODE
    //Robot.driveTrain.setLeftMotors(0);
    //Robot.driveTrain.setRightMotors(0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    
    Robot.driveTrain.ArcadeDrive(0, 0);
    //end();

  }
}
