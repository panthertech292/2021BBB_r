// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.ShooterSubsystem;

public class AimAdjustDown extends CommandBase {
  /** Creates a new AimAdjustDown. */
  public final ShooterSubsystem ShooterSubsystem;
  public AimAdjustDown(ShooterSubsystem s_ShooterSubsystem) {
    ShooterSubsystem = s_ShooterSubsystem;
    addRequirements(s_ShooterSubsystem);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute(){
    System.out.println("We are executing");
    System.out.println(ShooterSubsystem.aimResetCheck());
    if(ShooterSubsystem.aimResetCheck()==true){
      ShooterSubsystem.ShooterAimDown();
      System.out.println("We are trying to go down");
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    ShooterSubsystem.ShooterAimStop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return ShooterSubsystem.AimSwitchValue();
  }
}
