package com.capacitacion;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.logging.Logger;

public class Elevator {

    private static final Logger logger = Logger.getLogger(Elevator.class.getName());
    static Consumer<String> writeInfo = (men) -> logger.info(men);

    public static void main(String[] args) throws InterruptedException {
        writeInfo.accept("Hello World");
        writeInfo.accept("Resultado " + (25 - 5 * 4 / 2 %3 - 10 + 4));

        elevator();
    }

    public static void elevator() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        boolean isElevatorActive;
        int numberFloor=0;
        int number =0;

        isElevatorActive = true;

        numberFloor = new Random().nextInt(10)+1;
        writeInfo.accept("Welcome to the elevator push the floor that your require 1-10, the floor actual is" + numberFloor);
        writeInfo.accept("Push number of floor");
        number = scanner.nextInt();

        while(number == numberFloor){
            writeInfo.accept("Push other floor diferent of actual");
            number = scanner.nextInt();
        }

        while (isElevatorActive == true){
            numberFloor = calculateFloor(numberFloor,number);
            writeInfo.accept("Do you want to continue ? write yes or not");
            String response = scanner.next();
            if (response.toUpperCase().equals("YES")) {
                writeInfo.accept("Welcome to the elevator push the floor that your require 1-10, the floor actual is" + numberFloor);
                writeInfo.accept("Push number of floor");
                number = scanner.nextInt();

                while(number == numberFloor){
                    writeInfo.accept("Push other floor diferent of actual");
                    number = scanner.nextInt();
                }
            } else {
                writeInfo.accept("Bye");
                isElevatorActive = false;
            }
        }

    }

    public static int calculateFloor(int actFloor, int requestFloor) throws InterruptedException {
        boolean isUp = actFloor<requestFloor;
        int floor=0;

        if (isUp){
            for(int i=actFloor; i<=requestFloor; i++){
                writeInfo.accept("The actual floor is " + i);
                floor = i;
                Thread.sleep(500);
            }
        }else{
            for(int i=actFloor; i>=requestFloor; i--){
                writeInfo.accept("The actual floor is " + i);
                floor = i;
                Thread.sleep(500);
            }
        }
        return floor;
    }

}
