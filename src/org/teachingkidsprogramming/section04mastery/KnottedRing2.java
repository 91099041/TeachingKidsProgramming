package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class KnottedRing2
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setX(600);
    Tortoise.setY(400);
    //      Make the tortoise move as fast as possible --#4
    Tortoise.setSpeed(10);
    createColorPalette();
    //          Do the following 30 times --#10.1
    for (int i = 0; i < 30; i++)
    {
      //              Change the pen color of the line the tortoise draws to the next color from the color wheel --#5
      Tortoise.setPenColor(ColorWheel.getNextColor());
      //              drawOctagonWithOverlap (recipe below) --#8.0
      drawOctagonWithOverlap();
      //       Turn the tortoise 1/30th of 360 degrees to the right --#9
      Tortoise.turn(360 / 30);
      //       Turn the tortoise 5 more degrees to the right --#11
      Tortoise.turn(5);
      //       End Repeat --#10.2
    }
  }
  private static void drawOctagonWithOverlap()
  {
    Tortoise.show();
    //    Make the tortoise move as fast as possible --#3
    Tortoise.setSpeed(10);
    //    createColorPalette (recipe below) --#8.1
    //
    colorPalette();
    //
    drawPentagon();
  }
  private static void drawPentagon()
  {
    //    drawPentagon (recipe below) --#10.1
    //
    //    ------------- Recipe for drawPentagon --#10.2
    //    Do the following 200 times --#2.1
    for (int i = 0; i < 200; i++)
    {
      //        adjustPen (recipe below) --#9.1
      //
      addJustPen(i);
      //
      Tortoise.move(i);
      Tortoise.turn(360 / 5);
      Tortoise.turn(1);
    }
    //    ------------- End of drawPentagon recipe --#10.3
  }
  private static void addJustPen(int i)
  {
    //        ------------- Recipe for adjustPen --#9.2
    //        Change the pen color of the line the tortoise draws to the next color on the color wheel --#6
    Tortoise.setPenColor(ColorWheel.getNextColor());
    //        Increase the tortoises pen width by 1 --#15           
    Tortoise.setPenWidth(i);
    //        If the tortoise's pen width is greater than 4, then --#17
    if (i > 4)
    {
      Tortoise.setPenWidth(1);
      //            Reset the pen width to 1 --#16
    }
    //        ------------- End of adjustPen recipe --#9.3 
  }
  private static void colorPalette()
  {
    //    ------------- Recipe for createColorPalette --#8.2
    //    Add steel blue to the color wheel --#7
    ColorWheel.addColor(PenColors.Blues.Blue);
    //    Add dark orchid to the color wheel --#11
    ColorWheel.addColor(PenColors.Purples.DarkOrchid);
    //    Add dark slate blue to the color wheel --#12
    //    Add teal to the color wheel --#13
    ColorWheel.addColor(PenColors.Blues.Teal);
    //    Add indigo to the color wheel --#14
    ColorWheel.addColor(PenColors.Purples.Indigo);
    //    ------------- End of createColorPalette recipe --#8.3
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(PenColors.Pinks.HotPink);
    ColorWheel.addColor(PenColors.Reds.Red);
    ColorWheel.addColor(PenColors.Pinks.Fuchsia);
    ColorWheel.addColor(PenColors.Reds.OrangeRed);
    ColorWheel.addColor(PenColors.Pinks.DeepPink);
    ColorWheel.addColor(PenColors.Reds.MediumVioletRed);
    ColorWheel.addColor(PenColors.Reds.Crimson);
    ColorWheel.addColor(PenColors.Reds.Tomato);
  }
}
