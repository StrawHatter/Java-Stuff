import java.util.Scanner;

public class StreamXORStringKey {

    public static void main(String args[]) {
	
	    Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		char[] key = {'r', 'h', 'u', 'b', 'a', 'r', 'b'}; // have to use array of chars or you'll get eerrors
		String output = "";
		int xor;
		char temp;
		
		for (int i = 0; i < input.length(); i++) {
		    xor = input.charAt(i) ^ key[i % key.length];
			temp = (char)xor;
			output = output + temp;
		}
		
		System.out.println(output);
	}
}
