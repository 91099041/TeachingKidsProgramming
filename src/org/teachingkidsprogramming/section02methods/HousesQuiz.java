package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingkidsprogramming.recipes.quizzes.graders.HousesQuizAdapter;
import org.teachingkidsprogramming.recipes.quizzes.graders.HousesQuizGrader;

public class HousesQuiz extends HousesQuizAdapter
{
  public void questions1Thru6()
  {
    // Question 1 
    //   small (recipe below) 
    small();
    //
    //   Question2
    //   medium (recipe below) 
    medium();
    //
    //   Question3
    //   large (recipe below) 
    large();
    //
    //   Question4
    //   moveTheLength (recipe below) 
    drawASide();
    //
    //   Question6
    //   drawASide (recipe below) 
    drawASide();
  }
  private void drawASide()
  {
    moveTheLength();
    turnTheCorner();
  }
  private void turnTheCorner()
  {
    //   ------------- Recipe for turnTheCorner 
    Tortoise.turn(-360 / 3);
    //   ------------- End of turnTheCorner recipe
  }
  private void moveTheLength()
  {
    //   ------------- Recipe for moveTheLength 
    Tortoise.move(length);
    //   ------------- End of moveTheLength recipe
  }
  private void large()
  {
    //   ------------- Recipe for large 
    length = 63;
    //   ------------- End of large recipe
  }
  private void medium()
  {
    //   ------------- Recipe for medium 
    length = 21;
    //   ------------- End of medium recipe
  }
  private void small()
  {
    //   ------------- Recipe for small 
    length = 7;
    //   ------------- End of small recipe
  }
  public static void main(String[] args)
  {
    new HousesQuizGrader().grade(new HousesQuiz());
  }
}
