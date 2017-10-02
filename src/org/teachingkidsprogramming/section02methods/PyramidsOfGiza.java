package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class PyramidsOfGiza
{
  public static void main(String[] args) throws Exception
  {
    setUpPyramidLand();
    Pyramid_1();
    Pyramid_2();
    Pyramid_3();
  }
  private static void Pyramid_3()
  {
    Tortoise.move(100);
    Tortoise.turn(90);
    Tortoise.move(100);
    Tortoise.turn(135);
    Tortoise.move(210);
  }
  private static void Pyramid_2()
  {
    Tortoise.move(100);
    Tortoise.turn(90);
    Tortoise.move(100);
    Tortoise.turn(-90);
  }
  private static void Pyramid_1()
  {
    Tortoise.turn(-90);
    Tortoise.move(220);
    Tortoise.turn(135);
    Pyramid_2();
  }
  private static void setUpPyramidLand()
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Blues.AliceBlue);
    Tortoise.setPenColor(PenColors.Yellows.DarkGoldenrod);
    Tortoise.setPenWidth(2);
    Tortoise.hide();
  }
}
