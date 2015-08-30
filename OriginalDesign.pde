void setup()
{
size(500,500);
}

void draw()
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

void KuruFace()
{
fill(255,208,0);
stroke(255,208,0);
ellipse(200,200,200,200);
}
void Eyes()
{
fill(255,255,255);
stroke(255,255,255);
ellipse(150,175,70,70);
ellipse(250,175,70,70);
}

void mouth()
{
fill(255,255,255);
stroke(255,255,255);

}
void headphone()
{
fill(255,255,255);
stroke(255,255,255);
ellipse(105,200,75,80);
ellipse(295,200,75,80);
}

void angry()
{
fill(167,168,153,75);
stroke(167,168,153,75);
ellipse(200,175,85,95);
}



