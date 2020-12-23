
public class Robot {

	public static void main(String[] args) {
		System.out.println("Hello World !");
		
		int[] robot = {0, 0, 0};
		String path = "";
		
		if(args.length != 1) for(int i = 0; i < 20; i ++) {
			if(Math.random() * 3 < 1) path += "L";
			else if(Math.random() * 2 < 1) path += "R";
			else path += "A";
		} else path = args[0];
		
		System.out.println("The path is : " + path);
		
		showRobot(robot);
		
		for(int i = 0; i < path.length(); i ++) {
			char current = path.charAt(i);
			
			if(robot[2] == 0) {
				if(current == 'L') {
					robot[0] --;
					robot[2] = 3;
				} else if(current == 'R') {
					robot[0] ++;
					robot[2] = 1;
				} else if(current == 'A') robot[1] ++;
			} else if(robot[2] == 1) {
				if(current == 'L') {
					robot[1] ++;
					robot[2] = 0;
				} else if(current == 'R') {
					robot[1] --;
					robot[2] = 2;
				} else if(current == 'A') robot[0] ++;
			} else if(robot[2] == 2) {
				if(current == 'L') {
					robot[0] ++;
					robot[2] = 1;
				} else if(current == 'R') {
					robot[0] --;
					robot[2] = 3;
				} else if(current == 'A') robot[1] --;
			} else if(robot[2] == 3) {
				if(current == 'L') {
					robot[1] --;
					robot[2] = 2;
				} else if(current == 'R') {
					robot[1] ++;
					robot[2] = 0;
				} else if(current == 'A') robot[0] --;
			}
	
			showRobot(robot);
		}
	}
	
	private static void showRobot(int[] robot) {
		String facing = "North";

		if(robot[2] == 1) facing = "East";
		else if(robot[2] == 2) facing = "South";
		else if(robot[2] == 3) facing = "West";

		System.out.println("Robot : (" + robot[0] + "; " + robot[1] + "; " + facing + ")");
	}

}
