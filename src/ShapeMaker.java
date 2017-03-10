import org.jointheleague.graphical.robot.Robot;

public class ShapeMaker {
void drawCube(){
	Robot rob = new Robot();	
	rob.penDown();
	rob.setSpeed(10);
	for(int i = 0; i < 5; i++){
	rob.move(150);
	rob.turn(90);
	}
	rob.turn(-45);
	rob.move(75);
	rob.turn(45);
	for(int i = 0; i < 4; i++){
	rob.move(150);
	rob.turn(90);
	}
	rob.move(150);
	rob.turn(135);
	rob.move(75);
	rob.turn(-45);
	rob.move(150);
	rob.turn(225);
	rob.move(75);
	rob.turn(-135);
	rob.move(150);
	rob.turn(-45);
	rob.move(75);
	rob.penUp();
	rob.moveTo(50, 50);
}
void drawSquare(int diameter){
	Robot gurd = new Robot();
	gurd.setSpeed(10);
	gurd.moveTo(100, 250);
	gurd.penDown();
	for(int i = 0; i < 4; i++){
	gurd.move(diameter);
	gurd.turn(90);
}
	gurd.penUp();
	gurd.moveTo(50, 50);
}
void makeSphereoid(){
	Robot adolftrump = new Robot();
adolftrump.setSpeed(10);
adolftrump.moveTo(150, 100);
adolftrump.penDown();
for(int i = 0; i < 360; i++){
	adolftrump.setSpeed(10);
	adolftrump.move(1);
	adolftrump.turn(1);
}
adolftrump.turn(45);
adolftrump.move(50);
adolftrump.moveTo(150, 100);
adolftrump.turn(-45);
for(int i = 0; i < 350; i++){
	adolftrump.setSpeed(10);
	adolftrump.move(1);
	adolftrump.turn(1);
}
adolftrump.turn(55);
adolftrump.move(60);
adolftrump.moveTo(150, 100);
adolftrump.turn(-45);
for(int i = 0; i < 340; i++){
	adolftrump.setSpeed(10);
	adolftrump.move(1);
	adolftrump.turn(1);
}
adolftrump.turn(65);
adolftrump.move(70);
adolftrump.moveTo(150, 100);
adolftrump.turn(-45);
for(int i = 0; i < 330; i++){
	adolftrump.setSpeed(10);
	adolftrump.move(1);
	adolftrump.turn(1);
}
adolftrump.turn(75);
adolftrump.move(80);
adolftrump.moveTo(150, 100);
adolftrump.turn(-45);
for(int i = 0; i < 320; i++){
	adolftrump.setSpeed(10);
	adolftrump.move(1);
	adolftrump.turn(1);
}
adolftrump.turn(85);
adolftrump.move(90);
adolftrump.moveTo(150, 100);
adolftrump.turn(-45);
for(int i = 0; i < 310; i++){
	adolftrump.setSpeed(10);
	adolftrump.move(1);
	adolftrump.turn(1);
}
adolftrump.turn(95);
adolftrump.move(80);
adolftrump.moveTo(150, 100);
adolftrump.turn(-45);
}
}