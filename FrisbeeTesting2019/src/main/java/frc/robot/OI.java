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
import frc.robot.commands.ConveyorMotorMove;
import frc.robot.commands.DiscPusher;
//import frc.robot.commands.DiscPusher;
import frc.robot.commands.Move;  //currently using MoveSequence instead
import frc.robot.commands.MoveSequence;
import frc.robot.commands.SnowMotorPush;
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
  Button aButton = new JoystickButton(stick, RobotMap.ButtonA);
  Button bButton = new JoystickButton(stick, RobotMap.ButtonB);
  Button backButton = new JoystickButton(stick, RobotMap.ButtonBack);

  public Button rightBumper = new JoystickButton(stick, RobotMap.RightBumper);
  public Button leftBumper = new JoystickButton(stick, RobotMap.LeftBumper);
  

  public double GetDriverRawAxis(int axis)
  {
    System.out.println(stick.getRawAxis(axis));
    return stick.getRawAxis(axis);
    //stick.getX();
    //stick.getY();
  }


  public OI()
  {
    SpinMotor spinner = new SpinMotor();
    //xButton.whenPressed(new Move(1, 0.5, 0));
    //aButton.whenPressed(new MoveSequence());  //Test this before the new motor


   // yButton.whileHeld(new SpinMotor(1));

    //Frisbee Motor test buttons
    // boolean b = spinner.getSpinState();
    // if (b == true)
    // {
    //   aButton.whenPressed(new SpinMotor(0));
    //   //spinner.setSpinState(false);
    //   b = false;
    // }
    // else
    // {
    //   aButton.whenPressed(new SpinMotor(0.25));
    //   //spinner.setSpinState(true);
    //   b = true;
    // }

    aButton.whenPressed(new SpinMotor(5, -0.25));
    aButton.cancelWhenPressed(new SpinMotor(5, 0));
    bButton.whenPressed(new SpinMotor(5, -0.5));
    xButton.whenPressed(new SpinMotor(5, -0.75));
    yButton.whenPressed(new SpinMotor(5, -1));

    backButton.whenPressed(new SpinMotor(5, 0));

      //This code is setup for pushing the disc using a servo
    //rightBumper.whenPressed(new DiscPusher(120));
    //leftBumper.whenPressed(new DiscPusher(0));


    //This code is to control the snowblower motor using the top controller buttons
    // rightBumper.whenPressed(new SnowMotorPush(0.5,0.5));
    // leftBumper.whenPressed(new SnowMotorPush(0.5,-0.5));


    //This code runs the conveyor belt motors
    rightBumper.whenPressed(new ConveyorMotorMove(1.3, 0.5));
    leftBumper.whenPressed(new ConveyorMotorMove(1.3, -0.5));





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
