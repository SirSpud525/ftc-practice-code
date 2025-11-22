package org.firstinspires.ftc.teamcode.KEYS;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

public class Key3 {

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

    public void turn(int input){
        bartholomew.setPosition(input);
    }

    //2
    //write a function which takes a single input as a whole number of motor ticks
    //using auto style code, accurately move two motors called "slide1" and "slide2" with power stored in
    //“slide1Power” and “slide2Power” to within 50 ticks of the desired position
    //Make sure to include some additional power to ensure that movement never stops entirely

    public void moveSlides(int pos){

        slide1.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        slide2.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        slide1.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        slide2.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        double additional = 0.1;
        double error = 50;
        int delay = 20;

        while (Math.abs(pos - slide1.getCurrentPosition()) > error){
            int slide1Dist = pos - slide1.getCurrentPosition();
            int slide2Dist = pos - slide2.getCurrentPosition();

            additional = Math.signum(slide1Dist) * 0.1;

            slide1Power = (double) slide1Dist / (double) Math.abs(pos);
            slide2Power = (double) slide2Dist / (double) Math.abs(pos);

            slide1Power = slide1Power / 2 + additional;
            slide2Power = slide2Power / 2 + additional;

            handleMotorPower();

            sleep(delay);

        }

    }


}
