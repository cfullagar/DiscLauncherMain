/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;
  public static final int leftMotor1Channel = 2;  //these ports copied from old code, but should maybe be updated 0, 1. 2 3?
  public static final int leftMotor2Channel = 3;
	public static final int rightMotor1Channel = 4;
  public static final int rightMotor2Channel = 5;

  public static final int discMotor = 6;
  public static final double spinSpeedVar = 0;

  public static final int pushMotor = 7;


  public static final int joystickPort = 0;  //usb input port
  
	public static final int leftStickInput = 0;  //check button values in drive station usb section
  public static final int rightStickInput = 1;
  
	public static final int ButtonX = 3;  //Buttons confirmed
  public static final int ButtonY = 4;
  public static final int ButtonA = 1;
  public static final int ButtonB = 2;
  public static final int ButtonBack = 7;

  public static final int RightBumper = 6;
  public static final int LeftBumper = 5;

  public static final int servoDisc = 1;

  
  public static final double testingSpeed = 0.55;
  public static final double practiceSpeed = 0.75;
  public static final double drivingSpeed = 0.75;
  public static final double fullSpeed = 1;





  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
