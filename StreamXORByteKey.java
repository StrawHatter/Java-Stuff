import java.util.Scanner;

public class StreamXORByteKey {

    public static void main(String arg[]) {
	  //byte a = Byte.parseByte(System.console().readLine("Input first byte "));
		//byte b = Byte.parseByte(System.console().readLine("Input second byte "));
		System.out.println("Enter first byte: ");
		Scanner sc = new Scanner(System.in);
		byte a = sc.nextByte();
		System.out.println("Enter second byte: ");
		byte b = sc.nextByte();
		
    // byte a1 = (byte)a & 0xFF;
		//byte b2 = (byte)b & 0xFF;
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

