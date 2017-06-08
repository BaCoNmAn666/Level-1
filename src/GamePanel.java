import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
Timer lol;
final int MENU_STATE = 0;
final int GAME_STATE = 1;
final int END_STATE = 2;
int currentSTate = MENU_STATE;
GameObject halp = new GameObject(82, 10, 72, 37);
GamePanel(){
	lol = new Timer(1000/60, this);
}
void updateMenuState(){
}
void updateGameState(){
}
void updateEndState(){
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		halp.update();
	}
void startGame(){
	lol.start();
}
public void paintComponent(Graphics g){
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
	System.out.println("Die");
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("Bye");
}
}
