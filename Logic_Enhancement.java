import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Logic_Enhancement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        boolean exit = false; // Flag to control the main menu loop
         // Main menu loop
        while (!exit) {
            System.out.println("\t\t\t\t\tWelcome to Puzzle-Based Learning Game");
            System.out.println("\t\t\tIntegrating Game Innovation and Logical Enhancement");
            System.out.println("HOME:");
            System.out.println("1. Word Cross");
            System.out.println("2. Word Scramble");
            System.out.println("3. Logic Riddle Adventure");
            System.out.println("4. Exit");
            System.out.print("Choose a game: ");
            int gameChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Handle user's game selection
           switch (gameChoice) {
    case 1:
        WordCrossMenu.start(scanner); // Start Word Cross game
        break;
    case 2:
        WordScrambleMenu.start(scanner); // Start Word Scramble game
        break;
    case 3:
        LogicRiddleMenu.start(scanner); // Start Logic Riddle Adventure
        break;
    case 4:
        System.out.println("Thanks for playing!");
        exit = true; // Exit the main loop
        break;
    default:
        System.out.println("Invalid choice! Try again.");
            }
        }

        scanner.close();  // Close scanner when exiting
    }
}
// Word Cross Menu class handles difficulty selection
class WordCrossMenu {
    public static void start(Scanner scanner) {
        System.out.println("\nChoose difficulty for Word Cross");
        System.out.println("1. Easy 2. Medium 3. Hard");
        System.out.print("Choose difficulty: ");
        int difficulty = scanner.nextInt();
        scanner.nextLine();  // Consume newline

         // Launch the corresponding difficulty level
        switch (difficulty) {
    case 1:
        WordCross.start(scanner);
        break;
    case 2:
        WordMedium.start(scanner);
        break;
    case 3:
        WordHard.start(scanner);
        break;
    default:
        System.out.println("Invalid difficulty!");
}
    }
    // Generic method to play Word Cross game
    static void playWordGame(Scanner scanner, String[] correctAnswers) {
        Set<String> foundAnswers = new HashSet<>();
        int score = 0;
        // Loop until all words are found
        while (foundAnswers.size() < correctAnswers.length) {
            System.out.print("\nEnter a word you found: ");
            String answer = scanner.nextLine().toUpperCase();
            boolean correct = false;
            
            // Check if the entered word is correct and not already found
            for (String w : correctAnswers) {
                if (w.equals(answer) && !foundAnswers.contains(w)) {
                    foundAnswers.add(w);
                    score++;
                    correct = true;
                    System.out.println("AWESOME! +1 point");
                    break;
                }
            }
            if (!correct) System.out.println("Incorrect or already found!");
        }
        System.out.println("You found all words! Score: " + score);
    }
}
// Easy Word Cross puzzle
class WordCross {
    public static void start(Scanner scanner) {
        System.out.println("\nC A T F I S H Q W E R\nZ X M O L K P J N V B\nB I R D T Y U I O P A\nH J K G D S F L C V M\nA P P L E R T Y U I O\nQ W E D T L I O N P A\nT R E E Z X C V B N M\nK J H S S U N Q W E R\nB E A R Y U I O P L K\nM N B V M O O N Q W E");
        String[] correctAnswers = {"CAT","FISH","DOG","BIRD","APPLE","TREE","SUN","BEAR","LION","MOON"};
        WordCrossMenu.playWordGame(scanner, correctAnswers);
    }
}
// Hard Word Cross puzzle
class WordMedium {
    public static void start(Scanner scanner) {
        System.out.println("\nR I V E R S T O N E Q W\nM X U N T A I N P L K J\nF O R E S T Y Z A S D F\nO C E A N L P A S D G H\nB R E E Z E H G F D J K\nS H A D O W A L I G B N\nT H U N D E R M O N Q W\nF L O W E R C L O U P A\nM E A D O W R A I N Z X\nS U N S E T N I G H C V\nS T A R F L I G H T M N\nC L O U D S K Y B O A R");
        String[] correctAnswers = {"RIVER","STONE","MOUNTAIN","FOREST","OCEAN","BREEZE","SHADOW","THUNDER","FLOWER","MEADOW","SUNSET","STARFLIGHT","CLOUD","SKY","RAIN"};
        WordCrossMenu.playWordGame(scanner, correctAnswers);
    }
}
// Hard Word Cross puzzle
class WordHard {
    public static void start(Scanner scanner) {
        System.out.println("\nW O L F X R A I N B O W M Q\nQ T A E L E A F P M C V Z K\nS L W O R L D G B N A H Y J\nH F L E O R A T E L T K U P\nA E R O U D M S F O E N C Q\nD R E V I R P L J D F X M A\nO S T A R M O O N A L K B E\nM N U S N O W Q K R Y L P F\nE C R E V I R E V I R G H T\nB A T T E R F L Y Z X C V B\nH A C K Q W E R T Y U I O P\nL I B R A R Y A S D F G H J\nF U N C T I O N K L Z X C V\nS E N S O R Q W E R T Y U I\nP E R I P H E R A L M N B V");
        String[] correctAnswers = {"WOLF","RAINBOW","LEAF","WORLD","FOREST","RIVER","PRIDE","STAR","MOON","BUTTERFLY","HACK","MALWARE","INTERFACE","LIBRARY","DEBUGGING","FUNCTION","COMPILER","SENSOR","PERIPHERAL"};
        WordCrossMenu.playWordGame(scanner, correctAnswers);
    }
}
// Word Scramble Menu
class WordScrambleMenu {
    public static void start(Scanner scanner) {
        System.out.println("\nChoose difficulty for Word Scramble: 1. Easy 2. Medium 3. Hard");
        System.out.print("Choose difficulty: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

       List<String> words;

// Set words according to difficulty
switch (choice) {
    case 1:
        words = Arrays.asList("cat","tree","book","frog","game","dog","fish","milk","ball","star");
        break;
    case 2:
        words = Arrays.asList("planet","guitar","coffee","puzzle","school","window","mother","castle","silver","orange");
        break;
    case 3:
        words = Arrays.asList("programming","microphone","imagination","astronomy","laboratory","television","revolution","dictionary","architecture","mathematics");
        break;
    default:
        System.out.println("Invalid difficulty!");
        words = Collections.emptyList();
}
// Play scramble if words are available
if (!words.isEmpty()) {
    playScramble(scanner, words);
}
    }     
    // Scramble and play word guessing
    private static void playScramble(Scanner scanner, List<String> words) {
        Collections.shuffle(words); // Randomize words
        int score = 0;
        
        // Limit to 10 words
        for (int i = 0; i < Math.min(10, words.size()); i++) {
            String word = words.get(i);
            String scrambled = Scrambler.scramble(word); // Scramble letters
            System.out.println("\nScrambled word: " + scrambled);
            System.out.print("Guess: ");
            String guess = scanner.nextLine().trim().toLowerCase();
            if (guess.equals(word)) { 
                System.out.println("Correct! +1"); 
                score++; 
            } else { 
                System.out.println("Wrong! Correct: " + word); 
            }
        }
        System.out.println("Completed! Score: " + score + "/10");
    }
}
// Helper class to scramble words
class Scrambler {
    public static String scramble(String word) {
        List<Character> chars = new ArrayList<>();
        for (char c : word.toCharArray()) chars.add(c);
        Collections.shuffle(chars); // Shuffle characters
        StringBuilder sb = new StringBuilder();
        for (char c : chars) sb.append(c);
        return sb.toString();
    }
}
// Logic Riddle Menu starter
class LogicRiddleMenu {
    public static void start(Scanner scanner) {
        GameRiddle game = new GameRiddle(scanner);
        game.play();
    }
}
// Abstract Riddle class to define structure    
abstract class Riddle {
    private final String question;
    private final String answer;
    private final String hint;
    private final String explanation;

    public Riddle(String question, String answer, String hint, String explanation) {
        this.question = question;
        this.answer = answer;
        this.hint = hint;
        this.explanation = explanation;
    }

    public String getQuestion() { return question; }
    public String getAnswer() { return answer; }
    public String getHint() { return hint; }
    public String getExplanation() { return explanation; }

    public abstract void display();
    public abstract boolean checkAnswer(String input);
}
// Deductive riddle type
class DeductiveRiddle extends Riddle {
    public DeductiveRiddle(String q, String a, String h, String e) { super(q, a, h, e); }
    public void display() { System.out.println("Deductive Riddle: " + getQuestion()); System.out.println("Hint: " + getHint()); }
    public boolean checkAnswer(String input) { return input.equalsIgnoreCase(getAnswer()); }
}
// Syllogism riddle type
class SyllogismRiddle extends Riddle {
    public SyllogismRiddle(String q, String a, String h, String e) { super(q, a, h, e); }
    public void display() { System.out.println("Syllogism Riddle: " + getQuestion()); System.out.println("Hint: " + getHint()); }
    public boolean checkAnswer(String input) { return input.equalsIgnoreCase(getAnswer()); }
}
// Main logic for the riddle game
class GameRiddle {
    private Riddle[] riddles;
    private int currentRiddleIndex;
    private final Scanner scanner;
    private String difficulty;

    public GameRiddle(Scanner scanner) {
        this.scanner = scanner;
        currentRiddleIndex = 0;
    }
    // Initialize riddles based on difficulty
   private void initializeRiddles(String difficulty) {
    this.difficulty = difficulty;

    switch (difficulty.toLowerCase()) {

        case "easy":
            riddles = new Riddle[] {
                new DeductiveRiddle(
                    "If it rains, the ground is wet. It is raining. Is the ground wet?",
                    "yes", "Think about cause and effect.", "If the condition is met, the result follows."
                ),
                new SyllogismRiddle(
                    "All cats are mammals. Some mammals are pets. Are all cats pets?",
                    "no", "Not all mammals are pets.", "Middle term not distributed."
                ),
                new DeductiveRiddle(
                    "David's parents have three sons: Snap, Crackle, and what is the name of the third son?",
                    "David", "Think about the riddle setup.", "Trick riddle relying on deductive reasoning."
                ),
                new SyllogismRiddle(
                    "What can you break, even if you never pick it up or touch it?",
                    "A promise", "Can be broken without contact.", "Intangible thing."
                )
            };
            break;

        case "normal":
            riddles = new Riddle[] {
                new DeductiveRiddle(
                    "If all roses are flowers and some flowers fade quickly, do all roses fade quickly?",
                    "no", "Think about the logic.", "Conclusion doesn't follow from premise."
                ),
                new SyllogismRiddle(
                    "All men are mortal. Socrates is a man. Therefore, Socrates is mortal. What type of reasoning is this?",
                    "syllogism", "Classic logical argument.", "Syllogism with two premises and conclusion."
                ),
                new DeductiveRiddle(
                    "If A > B and B > C, then A > C. Is this always true?",
                    "yes", "Transitive property.", "Yes, transitive inequality."
                ),
                new SyllogismRiddle(
                    "What goes up but never comes down?",
                    "Age", "Represents time passed.", "Time passes forward."
                )
            };
            break;

        case "hard":
            riddles = new Riddle[] {
                new DeductiveRiddle(
                    "If all roses are flowers and some flowers fade quickly, do all roses fade quickly?",
                    "no", "Think about the logic.", "Conclusion doesn't follow."),
                new SyllogismRiddle(
                    "All men are mortal. Socrates is a man. Therefore, Socrates is mortal. What type of reasoning is this?",
                    "syllogism", "Classic example.", "Syllogism."),
                new DeductiveRiddle(
                    "If A > B and B > C, then A > C. Is this always true?",
                    "yes", "Transitive property.", "Yes, transitive inequality."),
                new SyllogismRiddle(
                    "No reptiles are warm-blooded. All snakes are reptiles. Therefore, no snakes are warm-blooded. Is this valid?",
                    "yes", "Check logical conclusion.", "Valid syllogism.")
            };
            break;

        default:
            System.out.println("Invalid difficulty. Defaulting to normal.");
            initializeRiddles("normal");
    }
}
     // Main gameplay loop
    public void play() {
        System.out.println("Choose difficulty level: easy, normal, hard.");
        String diffInput = scanner.nextLine().trim().toLowerCase();
        while (!diffInput.equals("easy") && !diffInput.equals("normal") && !diffInput.equals("hard")) {
            System.out.println("Invalid choice. Enter easy, normal, or hard.");
            diffInput = scanner.nextLine().trim().toLowerCase();
        }
        initializeRiddles(diffInput);
        System.out.println("\nSolve riddles to progress through the adventure!\n");

        // Loop through all riddles
        while (currentRiddleIndex < riddles.length) {
            clearConsole();
            System.out.println("Room " + (currentRiddleIndex + 1) + " of " + riddles.length);
            riddles[currentRiddleIndex].display();
            System.out.print("Your answer: ");
            String input = scanner.nextLine().trim();

            // Check answer
            if (riddles[currentRiddleIndex].checkAnswer(input)) {
                System.out.println("Correct! " + riddles[currentRiddleIndex].getExplanation());
                System.out.println("Press Enter to continue...");
                scanner.nextLine();
                currentRiddleIndex++;
            } else {
                System.out.println("Incorrect. Try again or type 'hint' for help.");
                input = scanner.nextLine().trim();
                if (input.equalsIgnoreCase("hint")) {
                    System.out.println("Hint: " + riddles[currentRiddleIndex].getHint());
                    System.out.println("Press Enter to try again...");
                    scanner.nextLine();
                } else if (riddles[currentRiddleIndex].checkAnswer(input)) {
                    System.out.println("Correct! " + riddles[currentRiddleIndex].getExplanation());
                    System.out.println("Press Enter to continue...");
                    scanner.nextLine();
                    currentRiddleIndex++;
                } else {
                    System.out.println("Still incorrect. Press Enter to try again...");
                    scanner.nextLine();
                }
            }
        }

        clearConsole();
        System.out.println("Congratulations! You completed the Logic Riddle Adventure on " + difficulty + " difficulty!");
    }
    // Clears console output for a cleaner experience
  private void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

