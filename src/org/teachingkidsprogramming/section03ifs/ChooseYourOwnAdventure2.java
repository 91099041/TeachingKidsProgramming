package org.teachingkidsprogramming.section03ifs;

import java.awt.Color;

import org.teachingextensions.approvals.lite.util.ThreadUtils;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ChooseYourOwnAdventure2
{
  public static void main(String[] args)
  {
    startStory();
  }
  private static void startStory()
  {
    tellMoreStory("One morning the Tortoise woke up in a dream.");
    animateStartStory();
    String action = askAQuestion("Do you want to 'wake up' or 'explore' the dream?");
    if ("wake up".equalsIgnoreCase(action))
    {
      wakeUp();
    }
    else if ("explore".equalsIgnoreCase(action))
    {
      approachOoze(action);
    }
    else
    {
      endStory();
    }
  }
  private static void endStory()
  {
    //      endStory (recipe below) --#6.1
    //      ------------- Recipe for endStory --#6.2
    //         Tell the user "You don't know how to read directions. You can't play this game. The end." --#5
    MessageBox.showMessage("You don't know how to read directions. You can't play this game. The end.");
    //      ------------- End of endStory recipe --#6.3
  }
  private static void approachOoze(String action)
  {
    //      approachOoze (recipe below) --#4.1
    //      ------------- Recipe for approachOoze --#4.2
    //         Tell the user "You approach a glowing, green bucket of ooze. Worried that you will get in trouble, you pick up the bucket." --#3
    MessageBox.showMessage(
        "You approach a glowing, green bucket of ooze. Worried that you will get in trouble, you pick up the bucket.");
    action = MessageBox.askForTextInput("Do you want to pour the ooze into the 'backyard' or 'toilet'?");
    //         If they answer "toilet" --#8.1
    if ("toilet".equalsIgnoreCase(action))
    {
      pourIntoToilet(action);
    }
    else if ("backyard".equalsIgnoreCase(action))
    {
      pourIntoBackyard(action);
    }
    else
    {
      //            endStory --#9
      endStory();
    }
    //      ------------- End of approachOoze recipe --#4.3
  }
  private static void pourIntoBackyard(String action)
  {
    //            pourIntoBackyard (recipe below) --#19.1
    //            ------------- Recipe for pourIntoBackyard --#19.2
    //                Tell the user "As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water." --#17
    MessageBox.showMessage(
        "As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water");
    //                Ask the user "As the man starts to prepare you as soup, do you...'Scream' or 'Faint'?" --#18
    action = MessageBox.askForTextInput("As the man starts to prepare you as soup, do you...'Scream' or 'Faint'?");
    //                If they answer "faint" --#20.1
    if ("faint".equalsIgnoreCase(action))
    {
      //                        Tell the user "You made a delicious soup! Yum! The end." --#21
      MessageBox.showMessage("You made a delicious soup! Yum! The end.");
    }
    else if ("Scream".equalsIgnoreCase(action))
    {
      startStory();
    }
    else
    {
      wakeUp();
    }
    //         ------------- End of pourIntoBackyard recipe --#19.3
  }
  private static void pourIntoToilet(String action)
  {
    //            ------------- Recipe for pourIntoToilet --#12.2
    //               Tell the user "As you pour the ooze into the toilet it backs up, gurgles, and explodes, covering you in radioactive waste." --#10
    MessageBox.showMessage(
        "the ooze into the toilet it backs up, gurgles, and explodes, covering you in radioactive waste.");
    //               Ask the user "Do you want to train to be a NINJA?  'Yes' or 'HECK YES'?" --#11
    action = MessageBox.askForTextInput("Do you want to train to be a NINJA?  'Yes' or 'Amen my brother'?");
    //               If they answer "yes" --#13.1
    if ("Yes".equalsIgnoreCase(action))
    {
      MessageBox
          .showMessage("Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!");
    }
    else if ("Amen my brother".equalsIgnoreCase(action))
    {
      MessageBox.showMessage(
          "Glory to the lord. You live out the rest of your life fighting crimes with God's word and eating the lords food.");
    }
    wakeUp();
    //            ------------- End of pourIntoToilet recipe --#12.3
  }
  private static void wakeUp()
  {
    //          ------------- Recipe for wakeUp --#2.2
    //              Tell the user "You wake up and have a boring day. The end." --#1
    MessageBox.showMessage("You wake up and have a boring day. The end.");
    //          ------------- End of wakeUp recipe --#2.3
  }
  private static void animateStartStory()
  {
    Tortoise.show();
    Color color = PenColors.Grays.Black;
    for (int i = 0; i < 25; i++)
    {
      Tortoise.getBackgroundWindow().setColor(color);
      color = PenColors.lighten(color);
      ThreadUtils.sleep(100);
    }
  }
  private static void tellMoreStory(String message)
  {
    MessageBox.showMessage(message);
  }
  private static String askAQuestion(String question)
  {
    String answer = MessageBox.askForTextInput(question);
    return answer;
  }
}