package pkgTestShape;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgShape.Rectangle;

public class RectangleTest {

	@Test
	public void areatest() 
	{
		Rectangle rec = new Rectangle(10,20);
				
		
		Rectangle test = new Rectangle();
		double output = test.area(10, 20);
		assertEquals(200, output);
		
	}

	
	@Test
	public void perimetertest()
	{
		Rectangle test = new Rectangle();
		double output = test.perimeter(10, 20);
		assertEquals(400, output);
	}
	
	@Test
	public void getLengthtest()
	{
		
		Rectangle test = new Rectangle();
		int output = test.getLength(10);
		assertEquals(10, output);
	}
	
	@Test
	public void getWidthtest()
	{
				
		Rectangle test = new Rectangle();
		int output = test.getWidth(20);
		assertEquals(20, output);
	}
	
	@Test
	public void setWidthtest()
	{
		Rectangle test = new Rectangle();
		int output = test.setWidth(-1);
		assertEquals(IllegalArgumentException, output);
	}
	
	@Test
	public void setLength()
	{
		Rectangle test = new Rectangle();
		int output = test.setLength(-2);
		assertEquals(IllegalArgumentException, output):
	}
}

