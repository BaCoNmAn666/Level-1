Car chevy = new Car(852, 546, 100, 50, 83, 217, 182, -1);
CrazyCar lolzor = new CrazyCar(157, 546, 100, 50, 234, 72, 193, 3);
void setup(){
 size(1000, 1000);
}
void draw(){
  background(0, 0, 0);
  chevy.draw();
  chevy.move();
lolzor.draw();
lolzor.move();
}
