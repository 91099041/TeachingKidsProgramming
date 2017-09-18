package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class DoubleLoop
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setX(225);
    Tortoise.setY(150);
    Tortoise.setSpeed(10);
    //  
    ColorWheel.addColor(PenColors.Reds.Crimson);
    ColorWheel.addColor(PenColors.Reds.DarkRed);
    ColorWheel.addColor(PenColors.Reds.FireBrick);
    for (int i = 0; i < 6; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.move(i * 4);
      Tortoise.turn(360 / -6);
      for (int j = 0; j < 15; j++)
      {
        Tortoise.setPenWidth(17);
        //              Move the tortoise 8 times the current line number you are drawing --#8.1
        Tortoise.move(j * 8);
        //              Turn the tortoise 1/5 of 360 degrees to the right --#6
        Tortoise.turn(360 / 5);
      }
      //    Hide the Tortoise --#10
      Tortoise.hide();
      Tortoise.getBackgroundWindow().setBackground(PenColors.Yellows.PeachPuff);
    }
    Tortoise.setX(300);
    Tortoise.setY(200);
    //    Do the following 5 times --#12.1
    for (int i = 0; i < 5; i++)
    {
      Tortoise.setPenColor(PenColors.Grays.Black);
      //        Move the Tortoise 25 pixels --#11
      Tortoise.move(25);
      //        Turn the tortoise 1/5 of 360 degrees to the right --#13  
      Tortoise.turn(360 / 5);
    }
  }
}
