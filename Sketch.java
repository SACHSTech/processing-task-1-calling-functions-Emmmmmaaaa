import processing.core.PApplet;

public class Sketch extends PApplet {
	
/**
 * This program sketches out a house 
 * @author: Emma Chan 
 * 
 * */	
  public void settings() {
	//size call 
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(138, 181, 237);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// background
    fill(21, 153, 51);
    rect(0,250,400,400);

  // roof
    fill(150,58,38);
    triangle(100, 200, 200, 80, 300, 200);  

  //main part of house
    fill(255,77,207);
    rect(100,200,200,200);

  // window 
    fill (247, 188, 224);
    rect(130, 240, 70, 70);

  //door 
    fill (211, 188, 247);
    rect(230, 310, 60, 100);

  //door knob
    fill(205, 219, 96);
    ellipse(250, 360, 10, 10);


  }
}