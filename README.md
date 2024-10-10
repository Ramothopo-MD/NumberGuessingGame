
# Number Guessing Game

This is a simple number guessing game implemented in Java. The game generates a random number between 1 and 10, and the player has to guess the correct number. The player receives feedback whether their guess is too high, too low, or correct. The game allows multiple rounds and displays a summary of the player's performance at the end.

## How to Play

1. The game will display a menu asking if you want to play:
   - Type `1` to start the game.
   - Type `2` to exit the game.

2. Once the game starts, it will generate a random number between 1 and 10.

3. You will be prompted to guess the number.
   - If your guess is correct, a message will appear saying "Correct guess."
   - If your guess is too high or too low, you'll receive feedback and can try again.

4. After each round, you can choose to play again or quit.

5. When you quit, a summary will be displayed, showing the number of rounds played, guesses made, and how many correct guesses you had.

## Features

- **Random Number Generation**: The game uses Java's `Random` class to generate numbers between 1 and 10.
- **Feedback System**: After each guess, you are given feedback if your guess is too high, too low, or correct.
- **Score Tracking**: The game keeps track of how many guesses were made, how many rounds were played, and how many correct guesses were made.
- **Simple GUI**: It uses `JOptionPane` for the user interface, which displays dialogs for input and output.

## Requirements

- **Java**: You must have the Java Development Kit (JDK) installed to compile and run the game.
  
## How to Run

1. Compile the code:
   ```bash
   javac NumberGame.java
