package fr.iutvalence.info.dut.m3105.preamble;

public class Rectangle extends Shape {
	
	private int width;
	private int heigh;
	
	public Rectangle(int width, int heigh)
	{
		this.width=width;
		this.heigh=heigh;
	}
	
	public String toString()
	{
		return "(Rectangle :" + this.width + "," + this.heigh + ")";
	}

}
