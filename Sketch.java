import processing.core.PApplet;
import java.util.Random;

public class Sketch extends PApplet {
	
  // randomizers
  Random myRandom = new Random();
  int intRandomX = myRandom.nextInt((500-20) + 1) + 20;
  int intRandomY = myRandom.nextInt((500-20) + 1) + 20;
  int intRandomZ = myRandom.nextInt((500-20) + 1) + 20;
  
  public void settings() {
	// put your size call here
    size(400, 400);
     
  }

  public void setup() {

    // changes background colour based on the randomizer values 
    if (intRandomZ <= 100) { 
      background(0, 0, 255);
    }
    else if ((intRandomZ > 100) && (intRandomZ <= 300)) {
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
    fill(intRandomZ + 100,intRandomZ + 100,intRandomZ * 0);
    ellipse(intRandomX,intRandomY,intRandomZ / 2,intRandomZ / 2);
    
    // displays the date when the program was runned
    fill(255,255,255);
    String s = String.valueOf(day);
    text(s, 10, 28);
    s = String.valueOf(month);
    text(s, 10, 56); 
    s = String.valueOf(year);
    text(s, 10, 84);
  }
  
 
}