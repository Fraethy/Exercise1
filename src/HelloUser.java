import java.io.BufferedReader;
import java.io.InputStream;
import java.util.Scanner;


public class HelloUser {
	
	private String userName;
	
	public HelloUser(String userName) {
		this.userName = userName;
	}
	
	public void greetUser() {
		System.out.println("Hello " + this.userName);
	}
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("WAZZUP?");
		String name = reader.nextLine();
		HelloUser h = new HelloUser(name);
		h.greetUser();
		reader.close();
	}
}
