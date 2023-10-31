package com.capacitacion;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.logging.Logger;

public class Elevator {

    private static final Logger logger = Logger.getLogger(Elevator.class.getName());
    static Consumer<String> writeInfo = (men) -> logger.info(men);
    static Scanner scanner = new Scanner(System.in);

    private static final int MAX_LEVEL = 20;
    private static final int MIN_LEVEL = 1;

    public void elevator() throws InterruptedException {

        boolean isElevatorActive;
        int numberFloor = 0;
        int number = 0;

        isElevatorActive = true;

        numberFloor = new Random().nextInt(MAX_LEVEL) + 1;
        writeInfo.accept("Welcome to the elevator push the floor that your require " + MIN_LEVEL + "-" + MAX_LEVEL
                + ", the floor actual is" + numberFloor);
        writeInfo.accept("Push number of floor");
        number = scanner.nextInt();

        while (number == numberFloor) {
            writeInfo.accept("Push other floor diferent of actual");
            number = scanner.nextInt();
        }

        while (isElevatorActive == true) {
            numberFloor = calculateFloor(numberFloor, number);
            writeInfo.accept("Do you want to continue ? write yes");
            String response = scanner.next();
            if (response.toUpperCase().equals("YES")) {
                writeInfo.accept("Welcome to the elevator push the floor that your require " + MIN_LEVEL + "-"
                        + MAX_LEVEL + ", the floor actual is" + numberFloor);
                writeInfo.accept("Push number of floor");
                number = scanner.nextInt();

                while (number == numberFloor) {
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
        boolean isUp = actFloor < requestFloor;
        int floor = 0;

        if (requestFloor > MAX_LEVEL || requestFloor < MIN_LEVEL) {
            writeInfo.accept("Incorrect floor");
            return actFloor;
        }

        if (isUp) {
            for (int i = actFloor; i <= requestFloor; i++) {
                writeInfo.accept("The actual floor is " + i);
                floor = i;
                Thread.sleep(500);
            }
        } else {
            for (int i = actFloor; i >= requestFloor; i--) {
                writeInfo.accept("The actual floor is " + i);
                floor = i;
                Thread.sleep(500);
            }
        }
        return floor;
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        Elevator.scanner = scanner;
    }

}
