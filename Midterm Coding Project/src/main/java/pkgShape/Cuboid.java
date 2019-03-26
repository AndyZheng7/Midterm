package pkgShape;

public class Cuboid extends Rectangle{

	private int Depth;
	
	public Cuboid()
	{
		super();
	}
	
	public Cuboid(int length, int width, int depth)
	{
		super();
		setLength(length);
		setWidth(width);
		setDepth(depth);
	}
	
	public void setDepth(int depth) {
		
		if (depth <= 0)
			throw new IllegalArgumentException();
		
		Depth = depth;
	}
	
	public int getDepth() {
		return Depth;
	}
	
	public static double area(int Length, int Width, int Depth)
	{
		return (double) 2 * (Depth * Length + Depth * Width + Length * Width);
	}
	
	public static double perimeter(int Length, int Width, int Depth)
	{
		return (double) 2 * ((Depth * Length) + (Length * Width) + 
				(Depth * Width));
	}
	
	public static double volume(int Length, int Width, int Depth)
	{
		return (double) Depth * Length * Width;
	}
	
}
