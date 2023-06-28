package cs3500.pa03.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * The AiPlayer class represents an AI player in the game.
 * It extends the PlayerImpl class and provides AI-specific behavior.
 */
public class AiPlayer extends PlayerImpl {

  @Override
  public String name() {
    return null;
  }


  @Override
  public List<Coord> takeShots() {
    Random random = new Random();
    List<Coord> selectedShots = new ArrayList<>();
    int originalSize = playerBoard.remainingShots.size();
    for (int i = 0; i < playerBoard.getShipNum(); i++) {
      int randomIndex = random.nextInt(originalSize);
      selectedShots.add(playerBoard.remainingShots.get(randomIndex));
      playerBoard.remainingShots.remove(randomIndex);
      originalSize--;
    }
    return selectedShots;
  }


  @Override
  public List<Coord> reportDamage(List<Coord> opponentShotsOnBoard) {
    return getDamageCoords(opponentShotsOnBoard, aiBoard);
  }

  public static List<Coord> getDamageCoords(List<Coord> opponentShotsOnBoard, Board aiBoard) {
    List<Coord> outputDamages = new ArrayList<>();
    for (Coord shot : opponentShotsOnBoard) {
      for (Ship ship : aiBoard.ships) {
        for (Coord occupied : ship.occupied()) {
          if (shot.x() == occupied.x() && shot.y() == occupied.y()) {
            outputDamages.add(shot);
          }
        }
      }
    }
    return outputDamages;
  }

  @Override
  public void successfulHits(List<Coord> shotsThatHitOpponentShips) {

  }

  @Override
  public void endGame(GameResult result, String reason) {

  }
}
