package Task2;

public class RemoteDevice {
	private State playing;
	private State paused;
	private State stopped;
	private State currentState;
	private int currentPosition; 

	public RemoteDevice() {
		playing = new Playing(this);
		paused = new Paused(this);
		stopped = new Stopped(this);
		currentState = stopped;
		currentPosition = 0;
	}

	public void setState(State currentState) {
		this.currentState = currentState;
	}

	public void setPosition(int position) {
		currentPosition = position;
	}

	public int getPosition() {
		return currentPosition;
	}

	public void pressPlay() {
		currentState.pressPlay();
	}

	public void pressPause() {
		currentState.pressPause();
	}

	public void pressStop() {
		currentState.pressStop();
	}

	public State getPlayingState() {
		return playing;
	}
	
	public State getPausedState() {
		return paused;
	}
	
	public State getStoppedState() {
		return stopped;
	}
}
