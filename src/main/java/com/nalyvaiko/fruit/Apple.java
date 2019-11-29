package com.nalyvaiko.fruit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Apple extends Fruit {

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
    logger.trace("Apple state trace message");
  }

  @Override
  void fruitExist() {
    logger.debug("Apple exist log message");
  }

  @Override
  void isEaten() {
    logger.info("Eaten Apple info message");
  }

  @Override
  void isOld() {
    logger.warn("Apple is old warn message");
  }

  @Override
  void isRotted() {
    logger.error("Apple is rotted error message");
  }

  @Override
  void isStolen() {
    logger.fatal("Apple is stolen fatal message");
  }
}
