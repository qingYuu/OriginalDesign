import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

public void setup()
{
size(500,500);
}

public void draw()
{
headphone();
KuruFace();
Eyes();
mouth();
if (mousePressed==true) 
	{  
		angry();
	}
}

public void KuruFace()
{
fill(255,208,0);
stroke(255,208,0);
ellipse(200,200,200,200);
}
public void Eyes()
{
fill(255,255,255);
stroke(255,255,255);
ellipse(150,175,70,70);
ellipse(250,175,70,70);
}

public void mouth()
{
fill(255,255,255);
stroke(255,255,255);

}
public void headphone()
{
fill(255,255,255);
stroke(255,255,255);
ellipse(105,200,75,80);
ellipse(295,200,75,80);
}

public void angry()
{
fill(167,168,153,75);
stroke(167,168,153,75);
ellipse(200,175,85,95);
}


  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
