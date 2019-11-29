package com.nalyvaiko.fruit;

public abstract class Fruit {

  public Fruit() {
  }

  public abstract void log();

  abstract void fruitState(); //trace

  abstract void fruitExist(); //log

  abstract void isEaten(); //info

  abstract void isOld(); //warn

  abstract void isRotted(); //error

  abstract void isStolen(); //fatal

}
