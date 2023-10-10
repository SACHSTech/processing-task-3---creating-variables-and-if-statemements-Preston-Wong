import processing.core.PApplet;
import java.util.Random;

public class Sketch extends PApplet {
	
  // randomizers
  Random myRandom = new Random();
  int intRandomWidth = myRandom.nextInt((1000-400) + 1) + 400;
  int intRandomHeight = myRandom.nextInt((1000-400) + 1) + 400;
  int intRandomX = myRandom.nextInt((500-20) + 1) + 20;
  int intRandomY = myRandom.nextInt((500-20) + 1) + 20;
  int intRandomColour = myRandom.nextInt((500-20) + 1) + 20;
  int intRandomSize = myRandom.nextInt((500-20) + 1) + 20;
  
  public void settings() {
	// size of the canvas
    size(intRandomWidth,intRandomHeight);
     
  }

  public void setup() {

    // changes background colour based on the randomizer values 
    if (intRandomX <= 100 && intRandomY <= 100) { 
      background(0, 0, 255);
    }
    else if ((intRandomX > 100 && intRandomX <= 300) && (intRandomY > 100 && intRandomY <=300 )) {
      background(0,0,128);
    }
    else {
      background(0,0,0);
    }

  }

  public void draw() {
    // variables for the date 
    int day = day();
    int month = month();
    int year = year();

    // draws the circle 
    fill(intRandomColour + 100,intRandomColour + 100,intRandomColour * 0);
    ellipse(intRandomX,intRandomY,intRandomSize / 2,intRandomSize / 2);
    
    // displays the date when the program was runned
    fill(255,255,255);
    String s = String.valueOf(day);
    text(s, 10, 28);
    s = String.valueOf(month);
    text(s, 30, 28); 
    s = String.valueOf(year);
    text(s, 50, 28);
  }
  
 
}