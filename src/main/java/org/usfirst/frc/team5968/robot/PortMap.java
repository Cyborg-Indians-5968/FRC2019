package org.usfirst.frc.team5968.robot;

public class PortMap {
    
    public enum USB {
        LEFT, 
        RIGHT
    }
    
    public enum CAN {
        LEFT_MOTOR_CONTROLLER_LEAD,
        LEFT_MOTOR_CONTROLLER_FOLLOW,
        RIGHT_MOTOR_CONTROLLER_LEAD,
        RIGHT_MOTOR_CONTROLLER_FOLLOW,
        MIDDLE_MOTOR_CONTROLLER_LEAD,
        MIDDLE_MOTOR_CONTROLLER_FOLLOW,
        LIFT_MOTOR_CONTROLLER,
        PCM
    }
    
    public static int portOf(USB usbDevice) {
        switch(usbDevice) {
        case LEFT:
            return 0;
        case RIGHT:
            return 1;
        default:
            return -1;
        }
    }
    
    public static int portOf(CAN canDevice) {
        switch(canDevice) {
        case LEFT_MOTOR_CONTROLLER_LEAD:
            return 2;
        case LEFT_MOTOR_CONTROLLER_FOLLOWER:
            return 3;
        case RIGHT_MOTOR_CONTROLLER_LEAD:
            return 4;
        case RIGHT_MOTOR_CONTROLLER_FOLLOWER:
            return 5;
        case LIFT_MOTOR_CONTROLLER: 
            return 1;
        case PCM:
            return 0;
        case MIDDLE_MOTOR_CONTROLLER_LEAD:
            return 6;
        case MIDDLE_MOTOR_CONTROLLER_FOLLOW:
            return 7;
        default:
            return -1;
        }
    }
    
}
