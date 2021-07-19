package PROJECT;
import java.util.Scanner;
public class Destination {
	Scanner sc = new Scanner(System.in);
	public String source;
	public String dest;
	public void from() {
		System.out.println("Choose your Source City: \n1.bangalore\n2.chennai \n3.delhi");
		int c = sc.nextInt();
		//String source;
		if (c == 1) {
			source = "bangalore";
		} else if (c == 2) {
			source = "chennai";

		} else {
			source = "delhi";
		}
	}

	public void to() {
		System.out.println("Choose your Destination \n1.bangalore\n2.chennai \n3.delhi");
		int c = sc.nextInt();
		if (c == 1) {
			dest = "bangalore";
		} else if (c == 2) {
			dest = "chennai";

		} else {
			dest = "delhi";
		}
		System.out.println("Please Check Our Services For Your Journey....");
	}
	
}
