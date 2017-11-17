package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;

public class SpiderWeb
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setPenWidth(1);
    Tortoise.setAnimal(Animals.Spider);
    Tortoise.setPenColor(Reds.Red);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.Black);
    Float length = 10.5f;
    Float zoom = 1.1f;
    for (int i = 0; i < 10; i++)
    {
      length = weaveOneLayer(length, zoom);
      zoom = (float) (zoom * 1.3);
    }
  }
  private static Float weaveOneLayer(Float length, Float zoom)
  {
    for (int i = 0; i < 6; i++)
    {
      drawTriangle(length);
      Tortoise.turn(360 / 6);
      length += zoom;
    }
    return length;
  }
  private static void drawTriangle(Float length)
  {
    for (int i = 0; i < 3; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(360 / 3);
    }
  }
}
