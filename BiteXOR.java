public class ByteXOR {

    public static void main(String args[]) {
	
	    //Part 2 
		byte a = (byte) 200;
		byte k = (byte) 40;
		
		byte c = (byte)(a ^ k);
		byte d = (byte)(c ^ k);
		
		System.out.printf("dec a: %d %n", a);
        System.out.printf("dec k: %d %n", k);
        System.out.printf("dec c: %d %n", c);
        System.out.printf("dec d: %d %n", d);
		
        System.out.printf("hex a: %H %n", a & 0XFF);
        System.out.printf("hex k: %H %n", k & 0XFF);
        System.out.printf("hex c: %H %n", c & 0XFF);
        System.out.printf("hex d: %H %n", d & 0XFF);
		
		System.out.printf("binary a:%s %n", Integer.toBinaryString(a & 0xFF));
        System.out.printf("binary k:%s %n", Integer.toBinaryString(k & 0xFF));
        System.out.printf("binary c:%s %n", Integer.toBinaryString(c & 0xFF));
        System.out.printf("binary d:%s %n", Integer.toBinaryString(d & 0xFF));
		
		// A and D both output the same regardless of it being a bin, dec, or hex
		
	}
}
