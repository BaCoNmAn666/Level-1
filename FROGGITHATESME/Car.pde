class Car{
 int x;
int y;
int w;
int speed;
Car(int x1, int y1, int w1, int speed1){
 x = x1;
 y = y1; 
 w = w1;
 speed = speed1;
}
void draw(){

  rect(x, y, w, 50); 
}
void move(){
 x += speed; 
 if(x <= -100){
 x = 500;
 }
}
  void display() 
  {
    fill(0,255,0);
    rect(x , y,  w, 50);
  }
int getX(){
return x;
}
int getY(){
return y;
 }
int getSize(){
return w;
}
boolean intersects(Car car) {
if ((y > car.getY() && y < car.getY()+50) && (x > car.getX() && x < car.getX()+car.getSize()))
          return true;
    else 
        return false;
}

}
