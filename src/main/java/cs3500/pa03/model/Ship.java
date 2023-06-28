package cs3500.pa03.model;

import java.util.List;

/**
 * The Ship class represents a ship on the game board.
 * It consists of a ship type and a list of occupied coordinates.
 */
public record Ship(ShipType type, List<Coord> occupied) {
}
