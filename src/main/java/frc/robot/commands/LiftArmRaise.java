// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.LiftSubsystem;

public class LiftArmRaise extends CommandBase {
  /** Creates a new LiftArmRaise. */
  public final LiftSubsystem LiftSubsystem;
  public LiftArmRaise(LiftSubsystem s_LiftSubsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    LiftSubsystem = s_LiftSubsystem;
    addRequirements(s_LiftSubsystem);
    
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    LiftSubsystem.LiftRaiseArms();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    //LiftSubsystem.LiftRaiseArms();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
