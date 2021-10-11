// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.LiftSubsystem;

public class LiftArmToggle extends CommandBase {
  /** Creates a new LiftArmToggle. */
  public final LiftSubsystem LiftSubsystem;

  //private boolean v_LiftArmToggleRan;
  public LiftArmToggle(LiftSubsystem s_LiftSubsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    LiftSubsystem = s_LiftSubsystem;
    addRequirements(s_LiftSubsystem);
    
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    System.out.println("Running toggle");
    //System.out.println(LiftSubsystem.LiftArmsDeployed());
    //if(LiftSubsystem.LiftArmsDeployed() == true){
    //  LiftSubsystem.LiftLowerArms();
    //}
    //else{
    //  LiftSubsystem.LiftRaiseArms();
    //}
    //v_LiftArmToggleRan = true;
    LiftSubsystem.LiftToggleArms();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
    //System.out.println("Running toggle from execute");
    //System.out.println(LiftSubsystem.LiftArmsDeployed());
    //if(LiftSubsystem.LiftArmsDeployed() == true){
    //  LiftSubsystem.LiftLowerArms();
    //}
    //else{
    //  LiftSubsystem.LiftRaiseArms();
    //}
    
  }
  

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    //v_LiftArmToggleRan = false;
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    //if (v_LiftArmToggleRan == true){
    //  return true;
    //}
    //else{
    //  return false;
    //}
    return false;
  }
}
