import java.util.Scanner;

public class DecryptKeyer {

    public static void main(String args[]) {
	
	    Scanner scan = new Scanner(System.in);
		byte input = scan.nextByte();
		byte input2 = scan.nextByte();
		
		// we dont know the byte however we know bytes = 8 bit = 255 possible values
		// brute force it baby
        //wanted to brute force the 2 inputs and then brute force to see if they match
		
		//for (int i = 2; i < 266; i++) {
		//    byte xor = (byte)i;
		//    byte output1 = (byte)(input ^ xor);
		//	byte output2 = (byte)(input2 ^ xor);
		//    if ((output1 == input) && (output2 == input2)) {
		//	System.out.println(output1);
		//	System.out.println(output2);
			
		//}
		//}
		}
		}
		
