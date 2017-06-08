
int x = 200;
int y = 380;
  Car car = new Car(350, 100, 100, -5);
  Car lolzor = new Car(350, 200, 100, -7);
  Car wyatt = new Car(350, 150, 100, -6);
  Car dave = new Car(350, 250, 100, -1);
  void setup(){
  size(400, 400);       
 }
  void draw(){
  background(196, 52, 253);     
  car.display();
  car.move();
  intersects(car);
lolzor.display();
lolzor.move();
intersects(lolzor);
wyatt.display();
wyatt.move();
intersects(wyatt);
dave.display();
dave.move();
intersects(dave);
fill(0, 255, 0);
ellipse(x, y, 60, 40);
if(y == 20){
  text("You win", 200, 200);
  textSize(24);
}
 if(y == 400){
 y = 380 ;
}
if(y == 0){
 y = 20; 
}
if(x == 10){
x = 20;  
}
if(x == 390){
x = 380;
}
  }
void keyPressed()
{
  if(key == CODED){
      if(keyCode == UP)
      {
y = y - 20;
      }
      else if(keyCode == DOWN)
      {
y = y + 10; 
      }
      else if(keyCode == RIGHT)
      {
x = x + 10;
      }
      else if(keyCode == LEFT)
      {
x = x - 10;
      }
   }
}
boolean intersects(Car car) {
if ((y > car.getY() && y < car.getY()+50) && (x > car.getX() && x < car.getX()+car.getSize())){
   x = 200;
y = 380;
  return true;
}
    else {
        return false;
}
}
