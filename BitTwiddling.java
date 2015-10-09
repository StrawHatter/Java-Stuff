public class BitTwiddling {

    public static void main(String args[]) {

        // Part 1
        byte a1 = (byte) 255;
        byte b1 = (byte) 85;

        System.out.printf("dec: %d %n", a1);
        System.out.printf("dec: %d %n", b1);

        System.out.printf("hex: %H %n", a1 & 0XFF);
        System.out.printf("hex: %H %n", b1 & 0XFF);

        System.out.printf("binary:%s %n", Integer.toBinaryString(a1 & 0xFF));
        System.out.printf("binary:%s %n", Integer.toBinaryString(b1 & 0xFF));

        // Part 2
        byte a2 = (byte) 0b11111111;
        byte b2 = (byte) 0b01010101;

        byte c2 = (byte)(a2 & b2);

        System.out.printf("c - decimal: %d  hex: %h  binary: %s %n", c2, (c2 & 0xFF), Integer.toBinaryString(c2 & 0xFF));

        // Part 3
        // a)
        byte a3 = (byte) 0xFF;
        byte b3 = (byte) 0x55;
        byte c3 = (byte)(a3 & b3);

        System.out.printf("0xFF AND 0x55 = %h %n", (c2 & 0xFF));

        // b)
        byte d4 = (byte) 0x18;
        byte e4 = (byte) ~d4;

        System.out.printf("NOT 0x18 = %h %n", (e4 & 0xFF));

        // c)
        byte f4 = (byte) 0x85;
        byte g4 = (byte) 0x55; //01010101b in Hex
        byte h4 = (byte) 0xF;  //15 in Hex
       
        byte i4 = (byte)(f4 | g4);
        byte j4 = (byte)(i4 & h4);

        System.out.printf("(0x85 OR 01010101b) AND 15 = 0x%d %n", j4);

        // Part 4
        // a)
        System.out.printf("Evaluates to: %b %n", (01010101 & 10101010));
    
        // b)
        System.out.printf("Evaluates to: %b %n", (01010101 | 10101010));

        // c)
        System.out.printf("Evaluated to: %b %n", (01010101 ^ 10101010));

        // Part 5
        byte flags = (byte) 01010001; //81 in binary
        byte b0mask = 0b00000001;
        byte b4mask = 0b00010000;
        byte b6mask = 0b01000000;

        byte combinedMask = (byte) (b6mask | b4mask | b0mask);

        if ((flags & combinedMask) == 0) {
            System.out.println("Bits b0, b4 and b6 are clear");
        }
            else {
                System.out.println("Bit b0, b4, b6  was set");
            }

        // Part 6
        char a = 127;
        // a) If we add 1 to a, it'll increase a to 128.
        // b) If we change a to be a byte and still add 1, it'll output 128 as well.         // The reason for this is In Java, char is a numeric type. When you add 1 to a char, you get to the
        // next unicode code point. In case of 'A', the next code point is 'B'.
    
        // Part 7
        byte a7 = (byte) 10;
        System.out.println(a7 / 0.25);

        // Nothing happens. 
    }
  }
