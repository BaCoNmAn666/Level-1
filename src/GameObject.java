import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
	Rectangle collisionBox;
	int x;
	int y;
	int width;
	int height;
	GameObject(int x, int y, int width, int height){
	this.x = x;
	this.y = y;
	this.width = width;
	this.height = height;
	collisionBox = new Rectangle(x, y, width, height);
	}
boolean isAlive = true;

void update(){
	
}
void draw(Graphics g){

}
}
