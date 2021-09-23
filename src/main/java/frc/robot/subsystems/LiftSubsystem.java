// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants.LiftConstants;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public class LiftSubsystem extends SubsystemBase {
  /** Creates a new LiftSubsystem. */
  private final DoubleSolenoid LeftLiftArm;
  private final DoubleSolenoid RightLiftArm;

  public LiftSubsystem() {
    LeftLiftArm = new DoubleSolenoid()
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
