package org.firstinspires.ftc.teamcode.KEYS;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

public class Key4 {

    //functions start here

    //1
    //write a function which uses the x button on the first gamepad to toggle an enum between three
    //states of power - full, partial, and off. Also use a debounce to ensure that the states of the enum
    //cannot change more often than every 0.3 seconds
    //declare the debounce and enum yourself above the function

    public ElapsedTime powerDebounce = new ElapsedTime();
    public enum Powers{
        FULL, PARTIAL, OFF
    }
    public Powers curPower = Powers.OFF;
    public void switchPower(Gamepad gp1){
        if (powerDebounce.milliseconds() <= 300){return;}
        if(gp1.x){

            powerDebounce.reset();

            if(curPower == Powers.FULL){
                curPower = Powers.PARTIAL;
            }else if(curPower == Powers.PARTIAL){
                curPower = Powers.OFF;
            }else{
                curPower = Powers.FULL;
            }
        }
    }


    //2***
    //write a function which toggles a boolean, shootingEnabled, between true and false
    //when up is pressed on the dpad, set it to true, when down is pressed, set it to false
    //don’t allow the state of the boolean to change more often than every half second

    public ElapsedTime debouncyHouse = new ElapsedTime();
    public boolean shootingEnabled;
    public void houseBounce(Gamepad gp){
        if (debouncyHouse.milliseconds() <= 500){return;}
        if(gp.dpad_up){
            shootingEnabled = true;
            debouncyHouse.reset();
        } else if(gp.dpad_down){
            shootingEnabled = false;
            debouncyHouse.reset();
        }

    }

    //3***
    //write a function and an enum
    //the enum should be for the possible states of a robot driving
    //forward, strafe right, and strafe left
    //when left stick up is pressed, switch the state to forward, left stick left to strafe left
    //and left stick right to strafe right
    //then, check what the current state is and make the robot do the corresponding action
    //also declare your own 4 drive motors
    //(hint hint - you may need to look up how mecanum wheels need to turn for strafing)

    public enum driveState{
        FORWARD, STRAFE_RIGHT, STRAFE_LEFT
    }
    public driveState curState = driveState.FORWARD;
    public DcMotor fl;
    public DcMotor fr;
    public DcMotor bl;
    public DcMotor br;
    public void driveAwayIntoSunset(Gamepad gp){
        if(gp.left_stick_y > 0.1){
            curState = driveState.FORWARD;
        } else if(gp.left_stick_x > 0.1){
            curState = driveState.STRAFE_RIGHT;
        } else if(gp.left_stick_x < 0.1){
            curState = driveState.STRAFE_LEFT;
        }

        if (curState == driveState.FORWARD){
            fl.setPower(1.0);
            fr.setPower(1.0);
            bl.setPower(1.0);
            br.setPower(1.0);
        } else if (curState == driveState.STRAFE_RIGHT){
            fl.setPower(1.0);
            fr.setPower(-1.0);
            bl.setPower(-1.0);
            br.setPower(1.0);
        } else {
            fl.setPower(-1.0);
            fr.setPower(1.0);
            bl.setPower(1.0);
            br.setPower(-1.0);
        }

    }

}
