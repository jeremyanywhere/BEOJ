package flyers;

public interface CanFly {
	public void fly();
	default public void glide() {System.out.println("better learn to do this!");}

}
