package CO4QN3;

import java.util.*;

public class authentication {
	public static void main(String args[]) {
		String usr = "tkm";
		String pass = "tkmce";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
		String username = sc.nextLine();
		System.out.println("Enter Password");
		String password = sc.nextLine();
		try {
			if((username.equals(usr)) && (password.equals(pass))){
				System.out.println("Access Granted");
			}
			else {
				throw new credentialexcep("Invalid Credentials");
			}
		}catch(credentialexcep e) {
			System.out.println(e.getMessage());
		}
		
	}
}
