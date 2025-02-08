import java.util.Scanner;

public class LoveStoryRPG {
    private static Scanner scanner = new Scanner(System.in);
    private static String partnerName = "[PARTNER'S NAME]"; // Replace with name
    private static String playerName = "[YOUR NAME]"; // Replace with your name

    public static void main(String[] args) {
        startGame();
    }

    private static void startGame() {
        clearConsole();
        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║       Our Love Story RPG         ║");
        System.out.println("║   A Journey of Shared Memories   ║");
        System.out.println("╚══════════════════════════════════╝\n");
        System.out.println("Press Enter to begin your adventure...");
        scanner.nextLine();

        chapter1();
    }

    private static void chapter1() {
        clearConsole();
        System.out.println("Chapter 1: The First Meeting\n");
        System.out.println("Once upon a time, in [LOCATION WHERE YOU MET]...");
        System.out.println("A nervous " + playerName + " saw " + partnerName + " for the first time");
        System.out.println("1. Approach with confidence");
        System.out.println("2. Play it cool");
        System.out.print("What did you do? (Enter 1-2): ");
        
        int choice = getChoice(2);
        String memory = (choice == 1) ? 
            "You walked over with your heart racing..." : 
            "You pretended not to notice, but kept stealing glances...";
        System.out.println("\n" + memory);
        System.out.println("\n(And that's how our story began...)");
        continuePrompt();
        
        chapter2();
    }

    private static void chapter2() {
        clearConsole();
        System.out.println("Chapter 2: First Date at [LOCATION OF FIRST DATE]\n");
        System.out.println("Remember when we...");
        System.out.println("1. Shared our first laugh over [MEMORY]");
        System.out.println("2. Had that awkward moment with [FUNNY MEMORY]");
        System.out.print("Which memory is your favorite? (1-2): ");
        
        getChoice(2);
        System.out.println("\nThat moment I knew there was something special...");
        continuePrompt();
        
        chapter3();
    }

    private static void chapter3() {
        clearConsole();
        System.out.println("Chapter 3: Overcoming Challenges\n");
        System.out.println("Through all our adventures...");
        System.out.println("- The time we [CHALLENGE YOU OVERCAME]");
        System.out.println("- The night we [MEANINGFUL MEMORY]");
        System.out.println("- Our shared love of [SHARED INTEREST]");
        System.out.println("\nEvery moment made us stronger together");
        continuePrompt();
        
        finalChapter();
    }

    private static void finalChapter() {
        clearConsole();
        System.out.println("Final Chapter: The Present\n");
        System.out.println("Now here we are...");
        System.out.println("Through all these chapters of our story");
        System.out.println("There's one question left to ask...\n");
        continuePrompt();
        
        clearConsole();
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣶⣶⣶⣶⣶⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                           "⠀⠀⠀⠀⠀⣠⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣄⠀⠀⠀⠀⠀\n" +
                           "⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀\n" +
                           "⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀\n" +
                           "⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⠀\n" +
                           "⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠛⠛⠛⠿⣿⣷⡄\n" +
                           "⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠉⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿\n" +
                           "⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹\n" +
                           "⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                           "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⣠⣶⣶⣶⣶⠀⠀⠀⠀⠀⠀\n" +
                           "⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⢰⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀\n" +
                           "⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⣸⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀\n" +
                           "⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀⠀⠀\n" +
                           "⠀⠀⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀\n" +
                           "⠀⠀⠀⠈⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀\n");
        System.out.println(partnerName + ", will you make me the happiest person in the world?");
        System.out.println("1. Yes! I will marry you!");
        System.out.println("2. Of course! A thousand times yes!");
        System.out.print("Your answer: ");
        
        getChoice(2);
        System.out.println("\n\nYou've completed our love story!");
        System.out.println("(Real life continues now...)");
    }

    private static int getChoice(int max) {
        while(true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if(choice >= 1 && choice <= max) return choice;
                System.out.print("Please enter 1-" + max + ": ");
            } catch(Exception e) {
                System.out.print("Please enter a valid number: ");
            }
        }
    }

    private static void continuePrompt() {
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
    }

    private static void clearConsole() {
        try {
            if(System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                System.out.print("\033\143");
        } catch(Exception e) {}
    }
}
