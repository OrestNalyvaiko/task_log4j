package com.nalyvaiko.fruit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Banana extends Fruit {

  private static Logger logger = LogManager.getLogger();

  public void log() {
    fruitState();
    fruitExist();
    isEaten();
    isOld();
    isRotted();
    isStolen();
  }

  @Override
  void fruitState() {
    logger.trace("Banana state trace message");
  }

  @Override
  void fruitExist() {
    logger.debug("Banana exist log message");
  }

  @Override
  void isEaten() {
    logger.info("Eaten Banana info message");
  }

  @Override
  void isOld() {
    logger.warn("Banana is old warn message");
  }

  @Override
  void isRotted() {
    logger.error("Banana is rotted error message");
  }

  @Override
  void isStolen() {
    logger.fatal("Banana is stolen fatal message");
  }
}
