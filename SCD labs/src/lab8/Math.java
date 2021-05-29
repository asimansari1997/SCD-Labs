package lab8;

public class Math {
	
	private final double pie = 3.142;
	public double circumference (double radius) {		
		return 2*pie*radius;
	}
	public double area (double radius) {
		return pie*(radius*radius);
	}
	public double volumeOfSphere (double radius) {
		return (4.0/3.0)*pie*(radius*radius*radius);
	}
	public double surfaceAreaofSphere (double radius) {
		return 4*pie*(radius*radius);
	}
}
