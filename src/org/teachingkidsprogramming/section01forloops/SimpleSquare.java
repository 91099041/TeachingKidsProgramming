package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setName("Michael");
    int sides = 80;
    Tortoise.show();
    Tortoise.setSpeed(10);
    for (int i = 0; i < sides; i++)
    {
      int lengthInPixels = i;
      Tortoise.setPenWidth(i);
      Tortoise.setPenColor(PenColors.getRandomColor());
      Tortoise.move(lengthInPixels);
      Tortoise.turn(2000 / sides);
    }
    //End Repeat --#5.2
    //  (Optional): Sign your work using the Virtual Proctor 
    //See your work at http://virtualproctor.tkpjava.org*/
  }
}
