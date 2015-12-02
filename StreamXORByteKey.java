import java.util.Scanner;

public class StreamXORByteKey {

    public static void main(String arg[]) {
	//System.out.println("Enter first byte: "); - taken out since we're reading from a file
	Scanner sc = new Scanner(System.in);
	byte a = sc.nextByte();
	//System.out.println("Enter second byte: "); - taken out since we're reading from a file
	byte b = sc.nextByte();
		
	byte key = (byte) 25;
		
	byte c = (byte)(a ^ key);
	byte d = (byte)(b ^ key);

	System.out.printf("dec: %d %n", c);
	System.out.printf("dec: %d %n", d);
        System.out.printf("hex: %H %n", c & 0XFF);
        System.out.printf("hex: %H %n", d & 0XFF);
        System.out.printf("binary:%s %n", Integer.toBinaryString(c & 0xFF));
        System.out.printf("binary:%s %n", Integer.toBinaryString(d & 0xFF));
	}
}
