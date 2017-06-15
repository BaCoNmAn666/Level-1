import javax.swing.JFrame;

public class LeaugeInvaders {
JFrame shooty = new JFrame();
public static final int w = 500;
public static final int h = 800;
GamePanel noob;
	public static void main(String[] args) {
LeaugeInvaders meme = new LeaugeInvaders();
	meme.setup();
	
	}
void setup(){
	noob = new GamePanel();
	shooty.add(noob);
	shooty.setSize(w, h);
	shooty.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	shooty.setVisible(true);
	shooty.addKeyListener(noob);
	noob.startGame();
}
}
