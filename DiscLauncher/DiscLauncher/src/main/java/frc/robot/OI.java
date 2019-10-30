/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
//import frc.robot.commands.Move;  //currently using MoveSequence instead
import frc.robot.commands.MoveSequence;
import frc.robot.commands.SpinMotor;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.

  Joystick stick = new Joystick(RobotMap.joystickPort);
  Button xButton = new JoystickButton(stick, RobotMap.ButtonX);
  Button yButton = new JoystickButton(stick, RobotMap.ButtonY);
  

  public double GetDriverRawAxis(int axis)
  {
    return stick.getRawAxis(axis);
    //stick.getX();
    //stick.getY();
  }


  public OI()
  {
    //xButton.whenPressed(new Move(5, 0.5, 0.5));
    xButton.whenPressed(new MoveSequence());  //Test this before the new motor
    yButton.whileHeld(new SpinMotor());

  }

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
