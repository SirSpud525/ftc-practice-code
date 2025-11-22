package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;
public class Unit4 {

    //now you don't get to ignore the top stuff because you
    //get to declare objects(motors or servos) and variables yourself

    //functions start here

    //1
    //write a function which uses the x button on the first gamepad to toggle an enum between three
    //states of power - full, partial, and off. Also use a debounce to ensure that the states of the enum
    //cannot change more often than every 0.3 seconds
    //declare the debounce and enum yourself above the function



    //2***
    //write a function which toggles a boolean, shootingEnabled, between true and false
    //when up is pressed on the dpad, set it to true, when down is pressed, set it to false
    //don’t allow the state of the boolean to change more often than every half second



    //3***
    //write a function and an enum
    //the enum should be for the possible states of a robot driving
    //forward, strafe right, and strafe left
    //when left stick up is pressed, switch the state to forward, left stick left to strafe left
    //and left stick right to strafe right
    //then, check what the current state is and make the robot do the corresponding action
    //also declare your own 4 drive motors
    //(hint hint - you may need to look up how mecanum wheels need to turn for strafing)



}
