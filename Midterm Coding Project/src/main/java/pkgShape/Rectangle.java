package pkgShape;

public class Rectangle extends Shape{
	
	private int Length;
	private int Width;
	public Rectangle() {
		super();
	}
	public Rectangle(int length, int width) {
		super();
		setLength(length);
		setWidth(width);
	}
	public int getLength() {
		return Length;
	}
	public void setLength(int length) {
		
		if (length <= 0)
			throw new IllegalArgumentException();
		
		Length = length;
	}
	public int getWidth() {
		return Width;
	}
	public void setWidth(int width) {
		
		if (width <= 0)
			throw new IllegalArgumentException();
		
		Width = width;
	}
	
	public static double area(int Length, int Width)
	{
		return (double)Length * Width;
	}
	
	public double area()
	{
		return (double)this.Length * this.Width;  
	}
	
	public static double perimeter(int Length, int Width)
	{
		return (double)2 * (Length + Width);
	}
	
	public double perimeter()
	{
		return (double)2 * (this.Length + this.Width);
	}
}
