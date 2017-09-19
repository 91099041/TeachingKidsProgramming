package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

@SuppressWarnings("unused")
public class TriangleShell
{
  private static int length = 1;
  public static void main(String[] args)
  {
    // Show the tortoise --#1
    Tortoise.show();
    // Make the tortoise go as fast as possible --#6
    Tortoise.setSpeed(10);
    // Do the following 60 times --#7.1
    for (int i = 0; i < 60; i++)
    {
      //      Change the pen color of the line the tortoise draws to a random color --#9
      Tortoise.setPenColor(PenColors.getRandomColor());
      //      Increase the current length of the side by 4 pixels --#8
      length += 4;
      drawATriangle();
      //
      //      Turn the tortoise 1/60th of 360 degrees to the right --#10
      Tortoise.turn(360 / 60);
    }
  }
  private static void drawATriangle()
  {
    for (int i = 0; i < 3; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(360 / 3);
    }
  }
}
