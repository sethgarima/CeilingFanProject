package CodingTest.CeilingFanProject;

public class Fan {
	public enum Rotation {
		CLOCKWISE, ANTICLOCKWISE
	}
	private static int MAX_SPEED = 3;
	private int speedOFFan;

	private Rotation fanDirection;

	public Fan() {
		speedOFFan = 0;
		fanDirection = Rotation.CLOCKWISE;
	}

	public int getSpeedOFFan() {
		return speedOFFan;
	}

	public Rotation getFanDirection() {
		return fanDirection;
	}

	public void pullChordFirst() {

		if(speedOFFan == maxSpeed()) {
			speedOFFan = 0;
			System.out.println("Turning the fan off");
		} 
		else {
			speedOFFan = speedOFFan + 1;
			System.out.println("Speed increased by 1");
		}

	}

	public void pullChordSecond() {
		if(fanDirection == Rotation.CLOCKWISE)
			fanDirection = Rotation.ANTICLOCKWISE;
		else
			fanDirection = Rotation.CLOCKWISE;
	}
	
	public int maxSpeed() {
		 return MAX_SPEED;
	}

}

