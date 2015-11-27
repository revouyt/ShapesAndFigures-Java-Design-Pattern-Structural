package fr.iutvalence.info.dut.m3105.preamble;

public class ShadowShapeDecorator extends ShapeDecorator {
	
	private int angle;
	private int intensité;
	
	public ShadowShapeDecorator(int angle, int intensité)
	{
		this.angle=angle;
		this.intensité=intensité;
	}
	
	public String toString()
	{
		return this.shape.toString()+
	}

}
