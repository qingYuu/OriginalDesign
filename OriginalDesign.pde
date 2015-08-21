void setup()
{
size(512, 512);
}
void draw()
{  
outsideegg();
insideegg();
}

void outsideegg()
{
fill(255,255,255);
ellipse(300, 300, 100, 100);
}

void insideegg()
{
fill(250,223,17);
ellipse(300, 300, 30, 30);
}