# FINAL_PROJECT-OOP

Puzzle-Based Learning Game: Integrating Game Innovation and Logical Enhancement

# Description / Overview

This project is a Java-based console game designed to strengthen problem-solving, critical thinking, and vocabulary skills. It features three main puzzle modes—Word Cross, Word Scramble, and Logic Riddle Adventure—each offering multiple difficulty levels. The program provides learners with fun and interactive challenges while enhancing logical reasoning, pattern recognition, and deductive thinking.

# OOP Concepts Applied

This project applies several Object-Oriented Programming (OOP) concepts:

# Encapsulation

Riddle properties (question, answer, hint, explanation) are stored as private fields with public getters.

Game logic for each puzzle is contained within its own class.

# Inheritance

DeductiveRiddle and SyllogismRiddle inherit from the abstract class Riddle.

They override the abstract methods display() and checkAnswer().

# Polymorphism

The Riddle array stores different riddle objects (both deductive and syllogism), demonstrating polymorphic behavior.

Method overriding allows different display styles for each riddle type.

# Abstraction

Riddle is an abstract class defining the structure and behavior of all riddles.

Only essential functionalities are exposed, hiding internal details.

# Modular Design

Separate classes for each game mode: WordCrossMenu, WordScrambleMenu, LogicRiddleMenu, etc.

Enhances maintainability and readability.

# Program Structure
Main Classes and Roles

Logic_Enhancement.java – Entry point containing the main menu.

WordCrossMenu / WordCross / WordMedium / WordHard – Handles Word Cross puzzle logic.

WordScrambleMenu / Scrambler – Manages word scrambling challenges.

Riddle (abstract) – Blueprint for all riddles.

DeductiveRiddle / SyllogismRiddle – Specific riddle types.

GameRiddle – Controls the riddle adventure flow, difficulty, and scoring.

Text-Based Class Diagram
Logic_Enhancement
 ├── WordCrossMenu
 │     ├── WordCross
 │     ├── WordMedium
 │     └── WordHard
 ├── WordScrambleMenu
 │     └── Scrambler
 └── LogicRiddleMenu
        └── GameRiddle
               ├── Riddle (abstract)
               │      ├── DeductiveRiddle
               │      └── SyllogismRiddle

# How to Run the Program
Prerequisites

Java JDK 17+ installed

Terminal or command prompt

Steps

Compile all Java files:

javac *.java


Run the main program:

java Logic_Enhancement


Use the menu to select from:

Word Cross

Word Scramble

Logic Riddle Adventure

Exit

# Sample Output
Main Menu
Welcome to Puzzle-Based Learning Game
Integrating Game Innovation and Logical Enhancement
HOME:
1. Word Cross
2. Word Scramble
3. Logic Riddle Adventure
4. Exit
Choose a game:

Word Scramble Example
Scrambled word: gmae
Guess: game
Correct! +1

Logic Riddle Example
Room 1 of 4
Deductive Riddle: If it rains, the ground is wet. It is raining. Is the ground wet?
Your answer: yes
Correct! If the condition is met, the result follows.

# Author and Acknowledgement

Author: Enrico A. Alvaro
Special thanks to instructors, peers, and references used in studying logic, Java, and OOP concepts.

# Other Sections You May Include
# Future Enhancements

GUI version using JavaFX or Swing

Scoring leaderboard

Time-based challenges

More puzzle categories

Save/load player progress

# References

Oracle Java Documentation

OOP concept resources

Puzzle and logic problem references
