package extensionMethods;

public class TinTrumpet implements Instrument, Toy {
	/**
	 * The method below must be implemented because there is a default implementation on both the Instrument 
	 * and Toy interfaces.  Those implementations can be accesses by the code below. 
	 */
	public void play()
	{
		Instrument.super.play();
		Toy.super.play();
		System.out.println("Make Toot Toot noises");
		
	}
}
