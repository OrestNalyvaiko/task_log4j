package com.nalyvaiko.fruit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Pear extends Fruit {

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
    logger.trace("Pear state trace message");
  }

  @Override
  void fruitExist() {
    logger.debug("Pear exist log message");
  }

  @Override
  void isEaten() {
    logger.info("Eaten Pear info message");
  }

  @Override
  void isOld() {
    logger.warn("Pear is old warn message");
  }

  @Override
  void isRotted() {
    logger.error("Pear is rotted error message");
  }

  @Override
  void isStolen() {
    logger.fatal("Pear is stolen fatal message");
  }
}
