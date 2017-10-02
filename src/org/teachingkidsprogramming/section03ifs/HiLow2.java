package org.teachingkidsprogramming.section03ifs;

import java.util.Random;

import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

//This variation tells how much errors they have left
public class HiLow2
{
  public static void main(String[] args)
  {
    Random rand = new Random();
    int answer = rand.nextInt(100) + 1;
    /*int answer = (int) (Math.random() * 100 + 1);*/
    for (int i = 1; i <= 8; i++)
    {
      int guess = MessageBox.askForNumericalInput("What is your guess?");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You dun diddly did it DADDYIO!");
        break;
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high!" + " " + (8 - i));
      }
      else
      {
        MessageBox.showMessage("Too low!");
        MessageBox.showMessage("Errors left" + " " + (8 - i));
      }
      if (i == 8)
      {
        MessageBox.showMessage("You dun goofed!");
      }
    }
  }
}
