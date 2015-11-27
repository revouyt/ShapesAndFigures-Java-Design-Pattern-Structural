package fr.iutvalence.info.dut.m3105.preamble;

public class PreambleApplication
{
	public static void main(String[] args)
	{
		Shape circle = new Circle(2);
		circle.draw(new Position(2,4));
		
		Shape rectangle=new Rectangle(2,3);
		rectangle.draw(new Position(10,10));
	}

}
