package com.nalyvaiko.fruit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Orange extends Fruit {

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
    logger.trace("Orange state trace message");
  }

  @Override
  void fruitExist() {
    logger.debug("Orange exist log message");
  }

  @Override
  void isEaten() {
    logger.info("Eaten orange info message");
  }

  @Override
  void isOld() {
    logger.warn("Orange is old warn message");
  }

  @Override
  void isRotted() {
    logger.error("Orange is rotted error message");
  }

  @Override
  void isStolen() {
    logger.fatal("Orange is stolen fatal message");
  }
}
