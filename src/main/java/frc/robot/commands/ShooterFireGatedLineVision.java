// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.ShooterSubsystem;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.GateSubsystem;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class ShooterFireGatedLineVision extends SequentialCommandGroup {
  /** Creates a new ShooterFireGatedLineVision. */
  private final DriveSubsystem DriveSubsystem;
  private final ShooterSubsystem ShooterSubsystem;
  private final GateSubsystem GateSubsystem;
  public ShooterFireGatedLineVision(DriveSubsystem s_DriveSubsystem, ShooterSubsystem s_ShooterSubsystem, GateSubsystem s_GateSubsystem) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    DriveSubsystem = s_DriveSubsystem;
    ShooterSubsystem = s_ShooterSubsystem;
    GateSubsystem = s_GateSubsystem;
    addRequirements(s_DriveSubsystem);
    addCommands(
      new VisionAll(s_DriveSubsystem, 2), //
      new ShooterFireGatedLine(s_ShooterSubsystem, s_GateSubsystem)
    );
  }
}
