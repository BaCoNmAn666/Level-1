import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {

	Timer lol;
ObjectManager manager = new ObjectManager();
Font titleFont;
Font subtitles;
final int MENU_STATE = 0;
final int GAME_STATE = 1;
final int END_STATE = 2;
int currentState = MENU_STATE;
GameObject halp = new GameObject(82, 10, 72, 37);
Rocketship space = new Rocketship(250, 700, 50, 50, 5);
public static BufferedImage alienImg;
public static BufferedImage rocketImg;
public static BufferedImage bulletImg;

GamePanel(){
	lol = new Timer(1000/60, this);
	titleFont = new Font("Arial", Font.PLAIN, 48);
	subtitles = new Font("Arial", Font.PLAIN, 24);
	manager.addObject(space);
	try {
		alienImg = ImageIO.read(this.getClass().getResourceAsStream("bowser.jpeg"));
		rocketImg = ImageIO.read(this.getClass().getResourceAsStream("mario.jpeg"));
		bulletImg = ImageIO.read(this.getClass().getResourceAsStream("shell.jpeg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
void updateMenuState(){
}
void updateGameState(){
	manager.update();
	manager.manageEnemies();
	manager.checkCollision();
	if(space.isAlive == false){
		currentState = END_STATE;
		manager.reset();
		space = new Rocketship(250, 700, 50, 50, 5);
	manager.addObject(space);
	}
manager.getScore();
}
void updateEndState(){
}
void drawMenuState(Graphics g){
	g.setColor(Color.BLUE);
	g.fillRect(0, 0, LeaugeInvaders.w, LeaugeInvaders.h);
	g.setFont(titleFont);
	g.setColor(Color.YELLOW);
	g.drawString("LEAGUE INVADERS", 30, 200);
	g.setFont(subtitles);
	g.drawString("Press ENTER to start", 130, 300);
	g.drawString("Press SPACE for instructions", 100, 400);
}
void drawGameState(Graphics g){
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, LeaugeInvaders.w, LeaugeInvaders.h);
	manager.draw(g);
}
void drawEndState(Graphics g){
	g.setColor(Color.RED);
	g.fillRect(0, 0, LeaugeInvaders.w, LeaugeInvaders.h);
	g.setFont(titleFont);
	g.setColor(Color.BLACK);
	g.drawString("GAME OVER", 110, 100);
	g.setFont(subtitles);
	g.drawString("You killed " + manager.getScore() + " aliens", 160, 300);
	g.drawString("Press BACKSPACE to restart", 80, 500);
	
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		if(currentState == MENU_STATE){
			updateMenuState();
		}else if(currentState == GAME_STATE){
			updateGameState();
		}else if(currentState == END_STATE){
			updateEndState();
		}
		halp.update();
	}
void startGame(){
	lol.start();
}
public void paintComponent(Graphics g){
if(currentState == MENU_STATE){
	drawMenuState(g);
}else if(currentState == GAME_STATE){
	drawGameState(g);
}else if(currentState == END_STATE){
	drawEndState(g);
}
	halp.draw(g);
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("Hi");
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
if(e.getKeyCode() == KeyEvent.VK_ENTER){
	currentState++;
	if(currentState > END_STATE){
		currentState = MENU_STATE;
}
}
if(e.getKeyCode() == KeyEvent.VK_UP){
	space.up = true;
}
if(e.getKeyCode() == KeyEvent.VK_DOWN){
	space.down = true;
}
if(e.getKeyCode() == KeyEvent.VK_RIGHT){
	space.right = true;
}
if(e.getKeyCode() == KeyEvent.VK_LEFT){
	space.left = true;
}
if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE){
	currentState = MENU_STATE;
}
if(e.getKeyCode() == KeyEvent.VK_SPACE){
	manager.addObject(new Projectile(space.x, space.y, 10, 10, 10));
}
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	if(e.getKeyCode() == KeyEvent.VK_UP){
		space.up = false;
	}
if(e.getKeyCode() == KeyEvent.VK_DOWN){
	space.down = false;
}
if(e.getKeyCode() == KeyEvent.VK_RIGHT){
	space.right = false;
}
if(e.getKeyCode() == KeyEvent.VK_LEFT){
	space.left = false;
}
}
}
