class Car{
 int x;
int y;
int w;
int h;
int r;
int g;
int b;
int speed;
Car(int x1, int y1, int w1, int h1, int r1, int g1, int b1, int speed1){
 x = x1;
 y = y1; 
 w = w1;
 h = h1;
 r = r1;
 g = g1;
 b = b1;
 speed = speed1;
}
void draw(){
 fill(r, g, b);
  rect(x, y, w, h); 
}
void move(){
 x += speed; 
}
}

