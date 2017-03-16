  int k = 1;
  int g = 1;
void setup(){
 size(1000, 1000);
 background(231, 123, 85); 
}
void draw(){
k = k + 1;
g = g + 1;
background(231, 123, 85);
  fill(0, 0, 0);
  rect(80 + k, 270, 50, 70);
  fill(34, 253, 184);
  rect(420, 130 + g, 80, 60);
  fill(153, 255, 51);
  triangle(999 - k, 999, 888 - g, 888, 777 - k, 999);
  fill(234, 184, 33);
  ellipse(500 - k, 500 - g, 80, 80);
}
