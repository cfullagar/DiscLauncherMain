/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.


  PWMVictorSPX leftMotor1 = new PWMVictorSPX(RobotMap.leftMotor1Channel);
  PWMVictorSPX leftMotor2 = new PWMVictorSPX(RobotMap.leftMotor2Channel);
  //Grouping Left Motors
    SpeedControllerGroup m_left = new SpeedControllerGroup(leftMotor1, leftMotor2);


  PWMVictorSPX rightMotor1 = new PWMVictorSPX(RobotMap.rightMotor1Channel);
  PWMVictorSPX rightMotor2 = new PWMVictorSPX(RobotMap.rightMotor2Channel);
  //Grouping Right Motors
    SpeedControllerGroup m_right = new SpeedControllerGroup(rightMotor1, rightMotor2);

 //Creating the Differential Drive Train/Object
  DifferentialDrive m_robotDrive = new DifferentialDrive(leftMotor1, rightMotor2);



  

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
     setDefaultCommand(new TankDrive());
  }

  public void ArcadeDrive(double speed, double rotation)
  {
    m_robotDrive.arcadeDrive(speed, rotation, true);
  }

  // public void setLeftMotors(double speed)
  // {
  //   leftMotor1.set(speed);
  //   leftMotor2.set(speed);
  // }

  // public void setRightMotors(double speed)
  // {
  //   rightMotor1.set(-speed);
  //   rightMotor2.set(-speed);
  // }
}

