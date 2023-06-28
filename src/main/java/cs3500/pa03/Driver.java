package cs3500.pa03;

import cs3500.pa03.controller.Controller;
import cs3500.pa03.controller.ControllerImpl;

/**
 * This is the main driver of this project.
 */
public class Driver {
  /**
   * Project entry point
   *
   * @param args - no command line args required
   */
  public static void main(String[] args) {
    Controller controller = new ControllerImpl();
    controller.run();
  }
}