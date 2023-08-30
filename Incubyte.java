import java.util.Scanner;

public class Incubyte {

	static char current_direction = 'N';
	static char previous_direction = 'N';
	static int x = 0;
	static int y = 0;
	static int z = 0;

	public static void main(String[] args) {

		System.out.println("Program started");
		System.out.println("Enter character one by one");
		System.out.println("To end - press 'e'");
		Scanner input = new Scanner(System.in);
		String command;
		char com;
		boolean go = true;
		while (go) {
			command = input.nextLine();
			com = command.charAt(0);
			switch (com) {
			case 'f':
				forward(); // [“f”, “r”, “u”, “b”, “l”]
				break;
			case 'b':
				backward();
				break;
			case 'l':
				left();
				break;
			case 'r':
				right();
				break;

			case 'u':
				up();
				break;

			case 'd':
				down();
				break;

			case 'e':
				// end
				go = false;
				break;

			default:
				break;
			}
		}
		System.out.println("(x,y,z) = " + x + "," + y + "," + z);
		System.out.println("Final Direction : " + current_direction);
	}

	private static void forward() {
		if (current_direction == 'N') {
			y++;
		} else if (current_direction == 'S') {
			y--;
		} else if (current_direction == 'E') {
			x++;
		} else if (current_direction == 'W') {
			x--;
		} else if (current_direction == 'U') {
			z++;
		} else if (current_direction == 'D') {
			z--;
		}
	}

	private static void backward() {

		if (current_direction == 'N') {
			y--;
		} else if (current_direction == 'S') {
			y++;
		} else if (current_direction == 'E') {
			x--;
		} else if (current_direction == 'W') {
			x++;
		} else if (current_direction == 'U') {
			z--;
		} else if (current_direction == 'D') {
			z++;
		}
	}

	private static void left() {

		if (current_direction == 'N') {
			previous_direction = current_direction;
			current_direction = 'W';
		} else if (current_direction == 'S') {
			previous_direction = current_direction;
			current_direction = 'E';
		} else if (current_direction == 'E') {
			previous_direction = current_direction;
			current_direction = 'N';
		} else if (current_direction == 'W') {
			previous_direction = current_direction;
			current_direction = 'S';
		} else if (current_direction == 'U') {
			if (previous_direction == 'N') {
				previous_direction = current_direction;
				current_direction = 'W';
			} else if (previous_direction == 'S') {
				previous_direction = current_direction;
				current_direction = 'E';
			} else if (previous_direction == 'E') {
				previous_direction = current_direction;
				current_direction = 'N';
			} else if (previous_direction == 'W') {
				previous_direction = current_direction;
				current_direction = 'S';
			}
		} else if (current_direction == 'D') {
			if (previous_direction == 'N') {
				previous_direction = current_direction;
				current_direction = 'W';
			} else if (previous_direction == 'S') {
				previous_direction = current_direction;
				current_direction = 'E';
			} else if (previous_direction == 'E') {
				previous_direction = current_direction;
				current_direction = 'N';
			} else if (previous_direction == 'W') {
				previous_direction = current_direction;
				current_direction = 'S';
			}
		}
	}

	private static void right() {

		if (current_direction == 'N') {
			previous_direction = current_direction;
			current_direction = 'E';
		} else if (current_direction == 'S') {
			previous_direction = current_direction;
			current_direction = 'W';
		} else if (current_direction == 'E') {
			previous_direction = current_direction;
			current_direction = 'S';
		} else if (current_direction == 'W') {
			previous_direction = current_direction;
			current_direction = 'N';
		} else if (current_direction == 'U') {
			if (previous_direction == 'N') {
				previous_direction = current_direction;
				current_direction = 'E';
			} else if (previous_direction == 'S') {
				previous_direction = current_direction;
				current_direction = 'W';
			} else if (previous_direction == 'E') {
				previous_direction = current_direction;
				current_direction = 'S';
			} else if (previous_direction == 'W') {
				previous_direction = current_direction;
				current_direction = 'N';
			}
		} else if (current_direction == 'D') {
			if (previous_direction == 'N') {
				previous_direction = current_direction;
				current_direction = 'E';
			} else if (previous_direction == 'S') {
				previous_direction = current_direction;
				current_direction = 'W';
			} else if (previous_direction == 'E') {
				previous_direction = current_direction;
				current_direction = 'S';
			} else if (previous_direction == 'W') {
				previous_direction = current_direction;
				current_direction = 'N';
			}
		}

	}

	private static void up() {

		if (current_direction != 'U' && current_direction != 'D') {
			previous_direction = current_direction;
			current_direction = 'U';
		} else if (current_direction == 'D') {
			// previous_direction = current_direction;
			current_direction = 'U';
		}
	}

	private static void down() {
		if (current_direction != 'U' && current_direction != 'D') {
			previous_direction = current_direction;
			current_direction = 'D';
		} else if (current_direction == 'U') {
			// previous_direction = current_direction;
			current_direction = 'U';
		}
	}
}