package _03_polymorphs;

import java.awt.Graphics;

public class MovingMorph extends Polymorph {

	MovingMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		
		setX(getX() + 5);
		setY(getY() + 5);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub

	}

}
