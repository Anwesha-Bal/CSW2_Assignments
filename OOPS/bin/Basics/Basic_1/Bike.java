package Basic_1;

class Bike implements Vehicle{
	int speed;
	int gear;
	@Override
	public void changeGear(int a) {
		gear=a;
	}
	@Override
	public void speedUp(int b) {
		speed = speed+b;
	}
	@Override
	public void applyBrake(int c) {
		speed = speed - c;
	}
	public void printStates() {
		System.out.println("Speed: "+speed+" gear: "+gear);
	}

}
