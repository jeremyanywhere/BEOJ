package extensionMethods;

public interface Toy {
	//public void play();
	public default void play() {
		System.out.println("Hold in hand, move around, imagining it is real");
	}
	/**
	 * Classes don't need to implement the method below. 
	 */
	public default void breakMe() {
		System.out.println("Right. I am not buying you any more of these");
	}
}
