import processing.core.PApplet;
import java.util.Random;

public class Sketch extends PApplet {
	
  Random myRandom = new Random();
  int intRandomX = myRandom.nextInt((500-20) + 1) + 20;
  int intRandomY = myRandom.nextInt((500-20) + 1) + 20;
  int intRandomZ = myRandom.nextInt((500-20) + 1) + 20;
  public void settings() {
	// put your size call here
    size(400, 400);
     
  }

  public void setup() {
    
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
    
    fill(intRandomZ + 100,intRandomZ + 100,intRandomZ * 0);
    ellipse(intRandomX,intRandomY,intRandomZ / 2,intRandomZ / 2);
  }
  
 
}