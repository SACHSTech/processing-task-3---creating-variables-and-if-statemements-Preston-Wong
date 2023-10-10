import processing.core.PApplet;
import java.util.Random;

public class Sketch extends PApplet {
	
	
   Random myRandom = new Random();
  int intRandom = myRandom.nextInt((300-20) + 1) + 20;

  public void settings() {
	// put your size call here
    size(400, 400);
   
    
  }


  public void setup() {
    
    background(210, 255, 173);
  }

  public void draw() {
    
    fill(204,100,0);
    ellipse(intRandom,intRandom,intRandom/2,intRandom/2);
  }
  
 
}