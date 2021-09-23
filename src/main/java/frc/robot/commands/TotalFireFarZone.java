// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Constants.ShooterConstants;
import frc.robot.subsystems.BeltSubsystem;
import frc.robot.subsystems.ShooterSubsystem;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class TotalFireFarZone extends SequentialCommandGroup {
  /** Creates a new TotalFireFarZone. */
  private final ShooterSubsystem ShooterSubsystem;
  private final BeltSubsystem BeltSubsystem;
  public TotalFireFarZone(ShooterSubsystem s_ShooterSubsystem, BeltSubsystem s_BeltSubsystem) {
    ShooterSubsystem = s_ShooterSubsystem;
    BeltSubsystem = s_BeltSubsystem;
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
      new AimAdjustStartingPosition(s_ShooterSubsystem),
      new AimAdjustFarZone(s_ShooterSubsystem),
      new BeltForwardAll(s_BeltSubsystem),
      new ShooterFireBelts(s_ShooterSubsystem, s_BeltSubsystem)
    );
  }
}
