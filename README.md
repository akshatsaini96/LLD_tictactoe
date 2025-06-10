
# 🎮 Tic Tac Toe - Low Level Design (LLD)

This is a simple object-oriented design of the **Tic Tac Toe** game using Java. It's built using clean code and good design practices. The goal is to understand how to design a game like this in a structured way.

---

## 💡 What This Project Does

- Lets 2 or more players play Tic Tac Toe
- Works with any board size (like 3x3, 4x4, etc.)
- Tracks if someone wins, draws, or if the game is still going
- Code is written in a way that’s easy to extend (like adding a bot in future)

---

## 🧱 Main Components (Classes)

- **Game** – runs the whole game
- **Board** – keeps track of the board and player moves
- **Player** – base class for all players
- **HumanPlayer** – a player who makes moves manually
- **Cell** – represents each square on the board
- **Move** – stores details of each move
- **GameStatus** – tells if the game is still going, won, or drawn
