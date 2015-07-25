package states;

public interface PlayerState {
	
	public PlayerState play();
	public PlayerState pause();
	public default PlayerState stop() {return Stopped.instance;}
	public default void displayState() {System.out.println( ""+getClass().getName());}
	
}


