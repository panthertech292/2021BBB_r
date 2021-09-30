// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import frc.robot.Constants.LiftConstants;



public class LiftSubsystem extends SubsystemBase {
  /** Creates a new LiftSubsystem. */
  //Motors
  private final WPI_TalonSRX liftElevationMotor;
  private final WPI_TalonSRX liftWinchMotor;
  //Variables
  private double v_liftSpeed;
  private double v_liftWinchSpeed;
  public LiftSubsystem() {
    liftElevationMotor = new WPI_TalonSRX(LiftConstants.kLiftElevation);
    liftWinchMotor = new WPI_TalonSRX(LiftConstants.kLiftWinch);
  }
  public void LiftUp(){
    v_liftSpeed = 0.5;
  }
  public void LiftDown(){
    v_liftSpeed = -0.5;
  }
  public void LiftStop(){
    v_liftSpeed = 0.0;
  }
  public void LiftRunWinch(){
    v_liftWinchSpeed = 0.5;
  }
  public void LiftStopWinch(){
    v_liftWinchSpeed = 0.0;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    liftElevationMotor.set(v_liftSpeed);
    liftWinchMotor.set(v_liftWinchSpeed);
  }
}
