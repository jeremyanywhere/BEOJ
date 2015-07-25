package states;

public class Stopped implements PlayerState {
	public static PlayerState instance = new Stopped();

	public PlayerState play() {
		return Playing.instance;
	}

	public PlayerState pause() {
		return instance;
	}


}
