
public class Car {
	int body;
	int chassis;
	int engine;
	int wheel;
	public Car() {

	}
	public void Body() {
		body += 1;
		System.out.println("Manufacturing: Body ");
	}
	public void Chassis() {
		chassis += 1;
		System.out.println("Manufacturing: Chassis");
	}
	public void Engine() {
		engine += 1;
		System.out.println("Manufacturing: Engine");
	}
	public void Wheel() {
		
		for (wheel=0;wheel<4;wheel++) {
			System.out.println("Manufacturing: Wheel");
		}
		
	}
	public void print() {
		System.out.println("Car parts: ");
		System.out.println("	Body");
		System.out.println("	Chassis");
		System.out.println("	Engine");
		System.out.println("	"+wheel+" Wheel");
		
		
		
		
		
	}
}
