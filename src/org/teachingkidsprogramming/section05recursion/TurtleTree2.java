package org.teachingkidsprogramming.section05recursion;

import java.awt.Color;
import java.util.HashMap;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class TurtleTree2
{
  @SuppressWarnings("unused")
  public static void main(String[] args)
  {
    Tortoise.show();
    //    Make the tortoise go as fast as possible --#10
    Tortoise.setSpeed(10);
    //    Turn the background black  --#21
    Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.Black);
    int length = -60;
    //    drawBranch(recipe below) --#2.1
    //
    drawBranch(length);
  }
  private static void drawBranch(int length)
  {
    if (length > 0)
    {
      //        adjustColor (recipe below)--#15.1
      adjustColor(length);
      Tortoise.move(length);
      //        drawLowerBranches (recipe below) --#6.1
      //
      drawLowerBranches(length);
      //
    }
  }
  private static void adjustColor(int length)
  {
    //        ------------- Recipe for adjustColor --#15.2
    HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
    //            A 10 pixel long branch is lime --#20
    colors.put(10, PenColors.Greens.Lime);
    //            A 20 pixel long branch is forest green --#19
    colors.put(20, PenColors.Greens.ForestGreen);
    //            A 30 pixel long branch is dark green --#18
    colors.put(30, PenColors.Greens.DarkGreen);
    //            A 40 pixel long branch is olive --#17
    colors.put(40, PenColors.Greens.Olive);
    //            A 50 pixel long branch is sienna --#14
    colors.put(50, PenColors.Browns.Sienna);
    //            A 60 pixel long branch is saddle brown (TIP: Put the values into the 'colors' HashMap)--#13
    colors.put(60, PenColors.Browns.SaddleBrown);
    //            Get the value of the branch length from the 'colors' HashMap and use that to set the pen color --#21
    Tortoise.setPenColor(colors.get(length));
    //        ------------- End of adjustColor --#15.3
  }
  private static void drawLowerBranches(int length)
  {
    //        ------------- Recipe for drawLowerBranches --#6.2
    //            Turn the Tortoise 30 degrees to the right --#3
    Tortoise.turn(30);
    //            drawShorterBranch (recipe below) --#8.1
    //
    drawShorterBranch(length);
    //
    //            Turn the Tortoise 60 degrees to the left --#7
    Tortoise.turn(-60);
    //            drawShorterBranch --#9
    drawShorterBranch(length);
    //            Turn the Tortoise 30 degrees to the right --#12
    Tortoise.turn(30);
    //            adjustColor --#16
    adjustColor(length);
    //            Move the tortoise backward the length of the current branch --#11
    Tortoise.move(-length);
    //        ------------- End of drawLowerBranches recipe --#6.3
  }
  private static void drawShorterBranch(int length)
  {
    //            ------------- Recipe for drawShorterBranch --#8.2
    //                drawBranch (10 pixels shorter) --#4
    drawBranch(length - 10);
    //            ------------- End of drawShorterBranch recipe --#8.3
  }
}