# FINAL_PROJECT-OOP

Integrating Game Innovation and Logical Enhancement

# Description / Overview

This program is designed to help a user to enhance their logical thinking skills because this console-based program consists of three games a puzzle-based games, like               word cross, word scrabble and a logic ride riddle. It’s combined a fun of interactive games with the benefits of logical thinking and problem-solving development.           Through the integration of innovative game mechanics, the system encourages users to think strategically, solve problems efficiently, and apply logic in various             scenarios.

# OOP Concepts Applied

• This project applies several Object-Oriented Programming (OOP) concepts:

Encapsulation

• Riddle properties (question, answer, hint, explanation) are stored as private fields with public getters.

• Game logic for each puzzle is contained within its own class.

Inheritance

• DeductiveRiddle and SyllogismRiddle inherit from the abstract class Riddle.

• They override the abstract methods display() and checkAnswer().

Polymorphism

• The Riddle array stores different riddle objects (both deductive and syllogism), demonstrating polymorphic behavior.

• Method overriding allows different display styles for each riddle type.

Abstraction

• Riddle is an abstract class defining the structure and behavior of all riddles.

• Only essential functionalities are exposed, hiding internal details.

# Modular Design

• Separate classes for each game mode: WordCrossMenu, WordScrambleMenu, LogicRiddleMenu, etc.

• Enhances maintainability and readability.

# Program Structure
Main Classes and Roles

• Logic_Enhancement.java – Entry point containing the main menu.

• WordCrossMenu / WordCross / WordMedium / WordHard – Handles Word Cross puzzle logic.

• WordScrambleMenu / Scrambler – Manages word scrambling challenges.

• Riddle (abstract) – Blueprint for all riddles.

• DeductiveRiddle / SyllogismRiddle – Specific riddle types.

• GameRiddle – Controls the riddle adventure flow, difficulty, and scoring.

• Text-Based Class Diagram

    Logic_Enhancement
     ├── WordCrossMenu
     │       ├── WordCross
     │       ├── WordMedium
     │       └── WordHard
     ├── WordScrambleMenu
     │       └── Scrambler
     └── LogicRiddleMenu
          └── GameRiddle        
                 ├── Riddle (abstract)
                 │      ├── DeductiveRiddle
                 │      └── SyllogismRiddle

# How to Run the Program

    • Prerequisites

    • Java JDK 17+ installed

    • Terminal or command prompt

# Steps

1. Compile all Java files:

2. javac *.java

3. Run the main program: java Logic_Enhancement

4. Use the menu to select from:

        - Word Cross

        - Word Scramble

        - Logic Riddle Adventure

5. Exit

# Sample Output

    Main Menu
    Welcome to Puzzle-Based Learning Game
    Integrating Game Innovation and Logical Enhancement
    HOME:
  
    1. Word Cross
    2. Word Scramble
    3. Logic Riddle Adventure
    4. Exit

# Choose a game:
    1. Word Scramble Example
      Scrambled word: gmae
      Guess: game
      Correct! +1

    2. Logic Riddle Example
      Room 1 of 4
      Deductive Riddle: If it rains, the ground is wet. It is raining. Is the ground wet?
      Your answer: yes
      Correct! If the condition is met, the result follows.

# Author and Acknowledgement

• This project would not have been possible without the dedication, effort, and collaborative skills of Enrico Alvaro, Andrei Lusterio, and Kayelene Amaira Vital. Specially thanks to our instructor Sir Emmanuel Charlie Enriquez who provided a clear instruction and value feedback throughout the development of this work.

# Other Sections You May Include

# Future Enhancements

    • GUI version using JavaFX or Swing

    • Scoring leaderboard

    • Time-based challenges

    • More puzzle categories

    • Save/load player progress

# References

• Oracle Java Documentation

• OOP concept resources

• Puzzle and logic problem references
