package states;

public class Pausing implements PlayerState {
	public static PlayerState instance = new Pausing();

	public PlayerState play() {
		return instance;
	}

	public PlayerState pause() {
		return Playing.instance;
	}

}
