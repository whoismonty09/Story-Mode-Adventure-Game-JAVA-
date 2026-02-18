import java.util.Scanner;

class Player {
    String name;
    int health = 100;
}

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Player player = new Player();

    public static void main(String[] args) {
        System.out.println("Adventure Game developed by Monty")
        System.out.print("Enter your name: ");
        player.name = sc.nextLine();

        System.out.println("Welcome " + player.name + " to the Adventure Game!");
        startGame();
    }

    static void startGame() {
        System.out.println("You are in a dark forest. Two paths appear.");
        System.out.println("1. Go left");
        System.out.println("2. Go right");

        int choice = sc.nextInt();

        if (choice == 1) {
            leftPath();
        } else if (choice == 2) {
            rightPath();
        } else {
            System.out.println("Invalid choice. Game over.");
        }
    }

    static void leftPath() {
        System.out.println("You encounter a wild animal.");
        System.out.println("1. Fight");
        System.out.println("2. Run");

        int choice = sc.nextInt();

        if (choice == 1) {
            player.health -= 30;
            System.out.println("You fought bravely. Health: " + player.health);
            treasureRoom();
        } else {
            System.out.println("You escaped safely. Game over.");
        }
    }

    static void rightPath() {
        System.out.println("You find a river.");
        System.out.println("1. Swim across");
        System.out.println("2. Build a raft");

        int choice = sc.nextInt();

        if (choice == 1) {
            player.health -= 20;
            System.out.println("You swam across. Health: " + player.health);
            treasureRoom();
        } else {
            System.out.println("You built a raft and crossed safely.");
            treasureRoom();
        }
    }

    static void treasureRoom() {
        System.out.println("You found a treasure chest!");
        System.out.println("1. Open it");
        System.out.println("2. Leave it");

        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Congratulations! You found the treasure and won the game!");
        } else {
            System.out.println("You left the treasure. Game over.");
        }
    }
}
