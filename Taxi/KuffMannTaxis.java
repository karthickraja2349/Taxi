package Taxi;

import java.util.Scanner;

public class KuffMannTaxis extends TaxiBooking {
    private Scanner input = new Scanner(System.in);

    public void start() {
        while (true) {
            displayMenu();
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    try {
                        userChoice();
                    } 
                    catch(CloneNotSupportedException e) {
                        System.out.println("Clone not supported");
                    }
                    break;
                case 2:
                    displayDetails();
                    break;
                case 3:
                    exitMenu();
                    break;
                default:
                    System.out.println("Enter the correct choice (1-3), you entered: " + choice);
            }
        }
    }

    private void displayMenu() {
        System.out.println("----------------------");
        System.out.println("| option | MainMenu  |");
        System.out.println("|--------+-----------|");
        System.out.println("|   1    |  Booking  |");
        System.out.println("|   2    |  Details  |");
        System.out.println("|   3    |  Exit     |");
        System.out.println("----------------------");
        System.out.println("Enter your choice");
    }

    private boolean locationCheck(char location) {
        return location >= 'A' && location <= 'F' || location >= 'a' && location <='f';
    }

    private void userChoice() throws CloneNotSupportedException {
        System.out.println("Enter Pickup Location (A-F):");
        char pickupLocation = input.next().charAt(0);
        System.out.println("Enter Drop Location (A-F):");
        char dropLocation = input.next().charAt(0);
        System.out.println("Enter the pickup Timing (Hour):");
        int pickupTime = input.nextInt();

        if (locationCheck(pickupLocation) && locationCheck(dropLocation) && pickupLocation!=dropLocation ) {
            String booking = booking(pickupLocation, dropLocation, pickupTime);
            System.out.println(booking);
        } else {
            System.out.println("Invalid location entered. Please enter a location between A and F.");
        }
    }

    private void exitMenu() {
        System.out.println("-----------------------------");
        System.out.println("| option |    ExitMenu      |");
        System.out.println("|--------+------------------|");
        System.out.println("|   1    |Are u sure to exit|");
        System.out.println("|   2    |      Back        |");
        System.out.println("-----------------------------");
        System.out.println("Enter the choice:");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Thank you for visiting us!");
                System.exit(0);
            case 2:
                return;
            default:
                System.out.println("Enter the correct choice (1-2), you entered: " + choice);
        }
    }
}
