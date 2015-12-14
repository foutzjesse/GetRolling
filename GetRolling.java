import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

//Define the obstacles.
public class BadBall
{
	//dimensions, start position, and angle of motion
	private final int WIDTH = 25; //define this by fraction of screen size
	private final int HEIGHT = 25; //define this by fraction of screen size
	private int x;
	private int y;
	private int rise;
	private int run;

	//randomly create new start position
	public BadBall(int x, int y, int rise, int run){
		this.x = x;
		this.y = y;
		this.rise = rise;
		this.run = run;
	}
	
	//did the ball collide with something?
	
	//if so, reflect it
	
	//top or bottom
	x = -x;
	
	//left or right
	y = -y;
	
	//other obstacle
	//theta_1 is the angle of motion for this object.
	//theta_2 is the angle of the other object.
	//phi is the contact angle.
	//x = ((cos(theta_1 - phi) + cos(theta_2 - phi)) x cos(phi)) + (sin(theta_1 - phi) x cos(phi + (pi / 2));
	//y = ((cos(theta_1 - phi) + cos(theta_2 - phi)) x sin(phi)) + (sin(theta_1 - phi) x sin(phi + (pi / 2));
}
