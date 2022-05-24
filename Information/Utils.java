package Information;
import java.util.Scanner;

public class Utils {

	private static Scanner sc;
	
	public static Scanner Henta() {
		if(sc == null) {
			return new Scanner(System.in);
		}
		return sc;
	}
}
