package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class Houses3
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(20);
    int height = 40;
    drawHousePointyRoof(90);
    drawTrapHouse(20);
    drawSlantHouse(height);
    drawHousePointyRoof(height);
    drawSlantHouse(90);
    drawHouseFlatRoof(20);
    drawSlantHouse(20);
    drawSlantHouse(20);
    drawHouseFlatRoof(120);
    drawSlantHouse(20);
    drawSlantHouse(height);
    drawParrelelHouse(height);
  }
  /*private static void drawHouse(int height)
  {
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.move(height);
    flatRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }*/
  private static void flatRoof()
  {
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
  private static void pointyRoof()
  {
    Tortoise.turn(45);
    Tortoise.move(15);
    Tortoise.turn(90);
    Tortoise.move(15);
    Tortoise.turn(45);
  }
  private static void trapRoof()
  {
    Tortoise.turn(45);
    Tortoise.move(10);
    Tortoise.turn(45);
    Tortoise.move(10);
    Tortoise.turn(45);
    Tortoise.move(10);
    Tortoise.turn(45);
  }
  private static void slantedRoof()
  {
    Tortoise.move(15);
    Tortoise.turn(360 / 3);
    Tortoise.move(30);
    Tortoise.turn(60);
  }
  private static void parralelRoof()
  {
    Tortoise.turn(45);
    Tortoise.move(15);
    Tortoise.turn(45);
    Tortoise.move(15);
    Tortoise.turn(360 / 2.5);
    Tortoise.move(15);
    Tortoise.turn(-53.45);
  }
  private static void drawParrelelHouse(int height)
  {
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.move(height);
    parralelRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawSlantHouse(int height)
  {
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.move(height);
    slantedRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawTrapHouse(int height)
  {
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.move(height);
    trapRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHousePointyRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.move(height);
    pointyRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHouseFlatRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.move(height);
    flatRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
}
