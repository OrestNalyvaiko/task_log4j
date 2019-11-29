package com.nalyvaiko;

import com.nalyvaiko.fruit.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

  private static Logger logger = LogManager.getLogger();

  public static void main(String[] args) {
    mainLog();
    fruitsLog();
  }

  private static void mainLog() {
    logger.trace("trace");
    logger.debug("log");
    logger.info("info");
    logger.warn("warn");
    logger.error("error");
    logger.fatal("fatal");
  }

  private static void fruitsLog() {
    Fruit fruit = new Orange();
    fruit.log();
    fruit = new Apple();
    fruit.log();
    fruit = new Banana();
    fruit.log();
    fruit = new Pear();
    fruit.log();
  }
}
