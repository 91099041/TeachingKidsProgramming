package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.Tortoise;

public class ConcentricLoop
{
  public static void main(String[] args)
  {
    Tortoise.show();
    //  Set the tortoise x position to 150 --#4.1
    Tortoise.setX(150);
    //  Set the tortoise y position to 200 --#4.2
    Tortoise.setY(200);
    //  Set the tortoise speed to 10  --#4.3
    Tortoise.setSpeed(10);
    for (int i = 0; i < 360; i++)
    {
      Tortoise.move(3);
      Tortoise.turn(1);
      //      If i is divisible by 20 --(HINT: Use mod operator '%') --#7
      if (i % 20 == 0)
      {
        for (int j = 0; j < 360; j++)
        {
          Tortoise.move(1);
          Tortoise.turn(1);
          Tortoise.setPenWidth(i / 100);
        }
      }
      //          Do the following 360 times --#8.1
    }
  }
}