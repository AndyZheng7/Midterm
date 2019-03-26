package TestCuboid;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgShape.Cuboid;

public class Cuboidtest {

	@Test
	public void volumetest() 
	{
		Cuboid test = new Cuboid();
		double output = test.volume(2, 3, 1);
		assertEquals(6, output);
	}
	
	@Test
	public void areatest()
	{
		Cuboid test = new Cuboid();
		double output = test.area(2, 3, 1);
		assertEquals(66, output);
	}
	
	@Test
	public void perimetertest()
	{
		Cuboid test = new Cuboid();
		double output = test.perimeter(2, 3, 1);
		assertEquals(22, output);
	}

	@Test
	public void setDepthtest()
	{
		Cuboid test = new Cuboid();
		int output = test.setDepth(-1);
		assertEquals(IllegalArgumentException, output);
	}
	
	@Test
	public void getDepthtest()
	{
				
		Cuboid test = new Cuboid();
		int output = test.getDepth(1);
		assertEquals(1, output);
	}
}

