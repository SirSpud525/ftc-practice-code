package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

public class Unit2 {
    //ignore this top stuff
    private DcMotor potatoMotor;
    private CRServo servoBob;
    private Servo defenestrate;
    private DcMotor microSpud;
    private DcMotor picoSpud;

    //functions start here

    //1
    //write a function which causes a motor called “potatoMotor” to turn forward when the a button
    //is pressed, and to turn backward when the b button is pressed
    //use gamepad 1 as the source of these inputs
    //if nothing is pressed, stop the movement of the motor



    //2
    //write a function which causes a CRServo called “servoBob” to turn forward when the right
    //trigger is pressed, and to stop movement when the left trigger is pressed
    //when no input is given, turn the servo backward. Use the second gamepad for input



    //3***
    //write a function which sets the position of a Servo named “defenestrate” to one of three positions:
    //when the dpad is pressed up, set the position to 1.0
    //when the dpad is pressed left or right, set the position to 0.5
    //when the dpad is pressed down, set the position to 0
    //use the second gamepad



    //4***
    //write a function that handles input for two motors, “microSpud” and “picoSpud”
    //using the first gamepad, when x is pressed, move only microSpud forwards
    //when y is pressed, move only picoSpud forwards, and when a is pressed, move both forwards
    //when no movement is requested from a motor, set its power to 0.1


}
