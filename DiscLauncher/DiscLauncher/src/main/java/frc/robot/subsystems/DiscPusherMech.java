/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.DiscPusher;

/**
 * Add your docs here.
 */
public class DiscPusherMech extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  Servo pusher = new Servo(RobotMap.servoDisc);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
     setDefaultCommand(new DiscPusher());
  }

  public void pushForward(int distance)
  {
    pusher.setPosition(distance);
  }

  public void pushBackward()
  {
    pusher.setPosition(0);
  }

  
}
