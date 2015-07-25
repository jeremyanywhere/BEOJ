package states;

public class Device {
	public static void main (String[] args) {
		PlayerState playerState = Stopped.instance;
		playerState.displayState();
		playerState = playerState.play();
		playerState.displayState();
		playerState = playerState.pause();
		playerState.displayState();
	}
}
