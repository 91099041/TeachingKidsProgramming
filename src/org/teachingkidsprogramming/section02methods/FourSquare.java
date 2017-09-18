package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class FourSquare
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    for (int i = 0; i < 4; i++)
    {
      for (int j = 0; i < 4; j++)
      {
        Tortoise.setPenColor(PenColors.getRandomColor());
        Tortoise.move(50);
        Tortoise.turn(90);
      }
      Tortoise.turn(90);
    }
  }
}
