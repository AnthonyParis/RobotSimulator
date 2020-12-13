
public class Robot {

	public static void main(String[] args) {
		System.out.println("Hello World !");
		
		int[] robot = {0, 0, 0};
		String path = "A";

		showRobot(robot);
		
		if(robot[2] == 0) {
			if(path == "L") {
				robot[0] --;
				robot[2] = 3;
			} else if(path == "R") {
				robot[0] ++;
				robot[2] = 1;
			} else if(path == "A") robot[1] ++;
		} else if(robot[2] == 1) {
			if(path == "L") {
				robot[1] ++;
				robot[2] = 0;
			} else if(path == "R") {
				robot[1] --;
				robot[2] = 2;
			} else if(path == "A") robot[0] ++;
		} else if(robot[2] == 2) {
			if(path == "L") {
				robot[0] ++;
				robot[2] = 1;
			} else if(path == "R") {
				robot[0] --;
				robot[2] = 3;
			} else if(path == "A") robot[1] --;
		} else if(robot[2] == 3) {
			if(path == "L") {
				robot[1] --;
				robot[2] = 2;
			} else if(path == "R") {
				robot[1] ++;
				robot[2] = 0;
			} else if(path == "A") robot[0] --;
		}

		showRobot(robot);
	}
	
	private static void showRobot(int[] robot) {
		String facing = "North";

		if(robot[2] == 1) facing = "East";
		else if(robot[2] == 2) facing = "South";
		else if(robot[2] == 3) facing = "West";

		System.out.println("Robot : (" + robot[0] + "; " + robot[1] + " - " + facing + ")");
	}

}
