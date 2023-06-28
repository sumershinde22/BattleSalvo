package cs3500.pa03.model;

import java.util.ArrayList;
import java.util.List;

/**
 * The Board class represents a game board.
 * It provides common functionality and data for both the player's and AI player's boards.
 */
public abstract class Board {
  public List<Ship> ships;
  public List<Coord> remainingShots;
  public List<Coord> currentShots;
  public List<Coord> shotsHit;
  public int height;
  public int width;

  /**
   * Constructs a Board object with the specified height, width, and list of ships.
   *
   * @param height The height of the board.
   * @param width  The width of the board.
   * @param ships  The list of ships on the board.
   */
  public Board(int height, int width, List<Ship> ships) {

    this.ships = ships;
    this.height = height;
    this.width = width;
    currentShots = new ArrayList<>();
    this.shotsHit = new ArrayList<>();
    remainingShots = new ArrayList<>();
    for (int i = 0; i < width; i++) {
      for (int j = 0; j < height; j++) {
        remainingShots.add(new Coord(i, j));
      }
    }
  }

  /**
   * Returns the current state of the board as a 2D char array.
   *
   * @return The board represented as a 2D char array.
   */
  public abstract char[][] returnBoard();

  /**
   * Returns the number of ships on the board.
   *
   * @return The number of ships on the board.
   */
  public int getShipNum() {
    return ships.size();
  }

  /**
   * Updates the board with the specified list of shots.
   *
   * @param shots The list of shots to update on the board.
   */
  public abstract void updateShots(List<Coord> shots);

  /**
   * Sets the current shots on the board.
   *
   * @param coords The list of coordinates representing the current shots.
   */
  public void setCurrentShots(List<Coord> coords) {
    currentShots = coords;
  }
}
