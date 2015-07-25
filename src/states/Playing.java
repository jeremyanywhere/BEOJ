package states;

public class Playing implements PlayerState {
	public static PlayerState instance = new Playing();

	public PlayerState play() {
		return instance;
	}

	public PlayerState pause() {
		return Pausing.instance;
	}

}
