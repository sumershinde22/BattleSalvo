package cs3500.pa03.model;

import static cs3500.pa03.model.AiPlayer.getDamageCoords;

import java.util.List;

public class ManualPlayer extends PlayerImpl {

  @Override
  public String name() {
    return null;
  }

  @Override
  public List<Coord> takeShots() {
    return playerBoard.currentShots;
  }

  @Override
  public List<Coord> reportDamage(List<Coord> opponentShotsOnBoard) {
    return getDamageCoords(opponentShotsOnBoard, playerBoard);
  }

  @Override
  public void successfulHits(List<Coord> shotsThatHitOpponentShips) {

  }

  @Override
  public void endGame(GameResult result, String reason) {
    return;
  }
}
