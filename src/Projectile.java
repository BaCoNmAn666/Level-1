import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject{

	Projectile(int x, int y, int width, int height, int speed) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	speed = 10;
	}
	void update(){

	}
	void draw(Graphics g){
		g.setColor(Color.red);
		g.fillRect(x, y, 50, 50);
	}
}
