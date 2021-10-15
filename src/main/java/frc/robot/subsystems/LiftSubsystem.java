// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

import frc.robot.Constants.LiftConstants;

public class LiftSubsystem extends SubsystemBase {
  /** Creates a new LiftSubsystem. */

  //Motors
  private final WPI_TalonSRX liftWinchMotor1;
  private final WPI_TalonSRX liftWinchMotor2;
  //Solenoids
  //private final DoubleSolenoid liftSolenoidLeft;
  //private final DoubleSolenoid liftSolenoidRight;
  //Variables
  private double v_liftWinchSpeed;

  public LiftSubsystem() {
    //Motors
    liftWinchMotor1 = new WPI_TalonSRX(LiftConstants.kLiftWinchMotor1);
    liftWinchMotor2 = new WPI_TalonSRX(LiftConstants.kLiftWinchMotor2);
    //Solenoids
    //liftSolenoidLeft = new DoubleSolenoid(LiftConstants.kliftSolenoidLeftUp, LiftConstants.kliftSolenoidLeftDown);
    //liftSolenoidRight = new DoubleSolenoid(LiftConstants.kliftSolenoidRightUp, LiftConstants.kliftSolenoidRightDown);
    //Variables
    v_liftWinchSpeed = 0.0;
  }

  public void LiftRunWinch(){
    v_liftWinchSpeed = 0.5;
  }
  //This function should only be used in the pits to rewind the winch!
  public void LiftReverseWinch(){
    v_liftWinchSpeed = -0.5;
  }
  public void LiftStopWinch(){
    v_liftWinchSpeed = 0.0;
  }
  /*public void LiftRaiseArms(){
    System.out.println("Going up!");
    liftSolenoidLeft.set(Value.kForward);
    liftSolenoidRight.set(Value.kForward);
  }
  public void LiftLowerArms(){
    System.out.println("Going down!");
    liftSolenoidLeft.set(Value.kReverse);
    liftSolenoidRight.set(Value.kReverse);
  }
  public void LiftToggleArms(){
    System.out.println("Toggling Arms!");
    liftSolenoidRight.toggle();
    liftSolenoidLeft.toggle();
  }*/
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    //liftWinchMotor1.set(v_liftWinchSpeed);
    //liftWinchMotor2.set(v_liftWinchSpeed);
    //System.out.println(liftSolenoidLeft.get());
    //System.out.println(liftSolenoidRight.get());
  }
}
