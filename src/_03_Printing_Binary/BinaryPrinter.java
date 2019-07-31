package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	public static void main(String[] args) {
		BinaryPrinter b = new BinaryPrinter();
		b.printByteBinary((byte) 127);
		b.printShortBinary((short) 255);
		b.printIntBinary((int) (Math.pow(2, 16)-1));
		b.printLongBinary((long) Math.pow(2, 32)-1);
	}
	
	public void printByteBinary(byte b) {
		System.out.println(binaryString((long) b));
	}
	
	public void printShortBinary(short s) {
		System.out.println(binaryString((long) s));
	}
	
	public void printIntBinary(int i) {
		System.out.println(binaryString((long) i));
	}
	
	public void printLongBinary(long l) {
		System.out.println(binaryString(l));
	}
	
	public static String binaryString(long l) {
		if(l == 0) {
			return "";
		}
		if(l % 2 == 1) {
			return binaryString((l-1)/2) + "1";
		}
		return binaryString(l/2) + "0";
	}
}
