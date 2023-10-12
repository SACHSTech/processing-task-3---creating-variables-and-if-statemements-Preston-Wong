import processing.core.PApplet;
import java.util.Random;

/**
 * Randomly skethes out the houes and changes the backgroung base on the house
 * @author Preston Wong 
 *
 */


public class Sketch extends PApplet {
	
  // randomizers
  Random myRandom = new Random();
  int intRandomWidth = myRandom.nextInt((800-400) + 1) + 400;
  int intRandomHeight = myRandom.nextInt((800-400) + 1) + 400;
  int intRandomX = myRandom.nextInt((800-20) + 1) + 20;
  int intRandomY = myRandom.nextInt((800-20) + 1) + 20;
  int intRandomColour = myRandom.nextInt((255-20) + 1) + 20;
  
  public void settings() {
	// size of the canvas
    size(intRandomWidth,intRandomHeight);
     
  }

  public void setup() {

    // changes background colour based on the randomizer values 
    if (intRandomX <= 400 && intRandomY <= 400) { 
      background(139,0,0);
    }
    else if ((intRandomX > 400 && intRandomX <= 800) && (intRandomY > 400 && intRandomY <= 800 )) {
      background(0,0,128);
    }
    else {
      background(0,0,0);
    }

  }

  public void draw() {
    // variables for the date 
    int hour = hour();
    int minute = minute();
  
	  // Body of the house
    fill(intRandomColour + 60,intRandomColour + 62,intRandomColour + 72);
    rect((float) (intRandomX/8), (float) (intRandomY/2),(float) (intRandomX/2), (float) (intRandomY/2.1));

    // Roof of the house
    fill(210,100,75);
    triangle((float) (intRandomX/8), (float) (intRandomY/2), (float) (intRandomX/2.66), (float) (intRandomY/4), (float) (intRandomX/1.6), (float) (intRandomY/2));

    // Window
    fill(255);
    ellipse((float) (intRandomX/2.667),(float) (intRandomY/2.58), (float) (intRandomX/8), (float) (intRandomY/8));
    line((float) (intRandomX/2.285), (float) (intRandomY/2.58), (float) (intRandomX/3.2),(float) (intRandomY/2.58));
    stroke(0);
    line ((float) (intRandomX/2.667), (float) (intRandomY/2.22), (float) (intRandomX/2.667), (float) (intRandomY/3.076));
    stroke(0);

    // Door and door handle
    fill(intRandomColour + 150,intRandomColour + 75,intRandomColour * 0);
    rect((float) (intRandomX/3.8), (float) (intRandomY/1.509), (float) (intRandomX/4.44), (float) (intRandomY/3.2));
    fill(0);
    ellipse((float) (intRandomX/2.19), (float) (intRandomY/1.2), (float) (intRandomX/40), (float) (intRandomY/40));  

    // displays the date when the program was runned
    fill(255,255,255);
    String s = String.valueOf(hour);
    text(s, 10, 28);
    s = String.valueOf(minute);
    text(s, 30, 28); 
  }
 
 
}