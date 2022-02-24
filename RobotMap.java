/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import edu.wpi.first.wpilibj.Joystick;

/**
 * Add your docs here.
 */
public class RobotMap {

    // Controllers //
    public static int joystickPort = 0;
    public Joystick logitech = new Joystick(RobotMap.joystickPort);

    // Motors //
        // Drive Train //
    public static int leftFrontMotor = 4;
    public static int leftRearMotor = 3;
    public static int rightFrontMotor = 1;
    public static int rightRearMotor = 2;
       
    // Throttle Setting //
    public static double maxThrottle = 0.7;
}