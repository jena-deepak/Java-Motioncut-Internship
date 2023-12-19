import java.util.Scanner;

public class TextAdventureGame {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        System.out.println("Welcome to the Adventure Game!");
        System.out.println("You find yourself in a mysterious forest. What do you want to do?");

        while (true) {
            System.out.println("\n1. Explore the forest");
            System.out.println("2. Go towards the mountains");
            System.out.println("3. Rest by the river");
            System.out.println("4. Quit");

            System.out.print("Enter your choice (1-4): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    exploreForest();
                    break;
                case "2":
                    goToMountains();
                    break;
                case "3":
                    restByRiver();
                    break;
                case "4":
                    System.out.println("Thanks for playing! Goodbye.");
                    System.exit(0);
                default:
                    System.out.println("Invalid input. Please enter a number between 1 and 4.");
            }
        }
    }

    public static void exploreForest() {
        System.out.println("\nYou start exploring the forest...");
        System.out.println("You come across a mysterious cave. What do you want to do?");
        System.out.println("1. Enter the cave");
        System.out.println("2. Continue exploring the forest");

        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            System.out.println("\nAs you enter the cave, you discover a hidden treasure!");
            System.out.println("Congratulations, you win!");
            System.exit(0);
        } else if (choice.equals("2")) {
            System.out.println("You continue exploring the forest.");
        } else {
            System.out.println("Invalid input. Please enter 1 or 2.");
        }
    }

    public static void goToMountains() {
        System.out.println("\nYou start walking towards the mountains...");
        System.out.println("You encounter a friendly mountain tribe. What do you want to do?");
        System.out.println("1. Join the tribe");
        System.out.println("2. Politely decline and continue your journey");

        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            System.out.println("\nThe tribe welcomes you with open arms. You find a new home.");
            System.out.println("Congratulations, you win!");
            System.exit(0);
        } else if (choice.equals("2")) {
            System.out.println("You decline the offer and continue your journey.");
        } else {
            System.out.println("Invalid input. Please enter 1 or 2.");
        }
    }

    public static void restByRiver() {
        System.out.println("\nYou decide to rest by the river...");
        System.out.println("You notice a boat on the riverbank. What do you want to do?");
        System.out.println("1. Take the boat and explore the river");
        System.out.println("2. Ignore the boat and continue resting");

        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            System.out.println("\nAs you sail down the river, you encounter a waterfall!");
            System.out.println("Unfortunately, your journey ends here. Game over.");
            System.exit(0);
        } else if (choice.equals("2")) {
            System.out.println("You choose to relax by the riverbank.");
        } else {
            System.out.println("Invalid input. Please enter 1 or 2.");
        }
    }
}
