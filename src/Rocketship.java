import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {

	Rocketship(int x, int y, int width, int height, int speed) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
boolean up = false;
boolean down = false;
boolean right = false;
boolean left = false;
	void update(){
super.update();
if(up){
	y -= 5;
}
if(down){
	y += 5;
}
	if(right){
		x += 5;
	}
	if(left){
		x -= 5;
	}
	
	collisionBox.setBounds(x, y, width, height);
	}
	void draw(Graphics g){
		g.drawImage(GamePanel.rocketImg, x, y, width, height, null);
	}
	
}
