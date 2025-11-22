package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;
public class Unit3 {

    //ignore this top stuff

    private Servo bartholomew;
    public double slide1Power;
    public double slide2Power;
    private DcMotor slide1;
    private DcMotor slide2;
    public void sleep(int amt){
        try {Thread.sleep(amt);} catch (InterruptedException e) {}
    }
    public void handleMotorPower(){
        //just pretend this does something
    }
    //functions start here

    //1
    //write an auto style function which turns a (normal) servo called "bartholomew" to the input position using a single input



    //2
    //write a function which takes a single input as a whole number of motor ticks
    //using auto style code, accurately move two motors called "slide1" and "slide2" with power stored in
    //“slide1Power” and “slide2Power” to within 50 ticks of the desired position
    //Make sure to include some additional power to ensure that movement never stops entirely



}
