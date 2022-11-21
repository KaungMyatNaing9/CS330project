package Programming;
import java.util.Scanner;
public class securitydevice {
	public static void main (String[]args) {
		int password;
		int lock=993061;
		int unlock=993064;
		Scanner scan=new Scanner(System.in);
		password=scan.nextInt();
		password=bugcheck(password);
		
		System.out.println(password);
		
	}
	
	public static int bugcheck(int password) {
		if(password<0) {
			password=0-password;
		}
		if(password>9) {
			return 2;
		}
		else {
			return password;
		}
	}
	public static boolean passcheck(int password) {
		
	}
}
